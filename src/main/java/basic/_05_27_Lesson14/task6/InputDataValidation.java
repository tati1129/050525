package basic._05_27_Lesson14.task6;

public class InputDataValidation {


    static ValidationResult checkUsername(String username) {
        int errorCode = 200;
        String error = "Ok";
        if (username.isBlank()) {
            errorCode = 400;
            error = error + "Имя пользователя не может быть пустым или состоять  только из пробелов";
        }
        if (username.length() < 5) {
            errorCode = 400;
            error = error + "Имя пользователя не может быть менее трех символов";
        }

        if (checkStringContainsSpaces(username)) {
            errorCode = 400;
            error = error + "Имя пользователя не может содержать пробелы";
        }
        return new ValidationResult(errorCode, error);
    }


    static ValidationResult checkPassword(String password) {
        int errorCode = 200;
        String error = "";
        if (password.isBlank()) {
            errorCode = 400;
            error = error + "Пароль не может быть пустым или состоять только из пробелов";
        }

        if (password.length() < 8) {
            errorCode = 400;
            error = error + "Пароль не может быть менее восьми символов";
        }

        if (checkStringContainsSpaces(password)) {
            errorCode = 400;
            error = error + "Пароль не может содержать пробелы";
        }

        return new ValidationResult(errorCode, error);
    }

    static ValidationResult checkEmail(String email) {
        int errorCode = 200;
        String error = "";
        if (email.isBlank() || checkStringContainsSpaces(email)) {
            errorCode = 400;
            error = error + "Email не может быть пустым или состоять только из пробелов";
        }
        if (checkStringContainsSpaces(email)) {
            errorCode = 400;
            error = error + "Email не может содержать пробелы";
        }

        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.');

        if ((atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) == false) {
            errorCode = 400;
            error = error + "Формат введенных данных не соответствует стандарту адреса электронной почты name@company.com";
        }
        return new ValidationResult(errorCode, error);
    }

    static ValidationResult checkDescription(String description) {
        if (description.length() > 25) {
            return new ValidationResult(400, "Длина описания не должна превышать 25 символов");
        }
        return new ValidationResult(200, "");
    }

    private static boolean checkStringContainsSpaces(String stringForCheck) {
        return stringForCheck.contains(" ");
    }
}


