package _05_27_Lesson14.task5;

import _05_27_Lesson14.UserInputStatic;

public class UserService {

    public User createNewUser() {

        String name = inputUserData("имя пользователя");
        String password = inputUserData("пароль");
        String email = inputUserData("email");
        String description = inputUserData("описание");

        User user = new User(name, password, email, description);
        return user;
    }


    private String inputUserData(String fieldName) {
        boolean checkResult = false;
        String userdata = "";
        String checkResultInfo = "";

        while (!checkResult) {
            userdata = UserInputStatic.inputString("Ведите " + fieldName);

            switch (fieldName) {
                case "имя пользователя"-> checkResultInfo = checkUsername(userdata);
                case "пароль" -> checkResultInfo = checkPassword(userdata);
                case "email" -> checkResultInfo = checkEmail(userdata);
                case "описание" -> checkResultInfo = checkDescription(userdata);
            }

            if (checkResultInfo.equals("Ok")) {
                checkResult = true;
            } else {
                System.out.println("Введенное " + fieldName + " не соответствует формату.");
                System.out.println(checkResultInfo + " Повторите ввод данных.");
            }
        }
        return userdata;
    }

    private String checkUsername(String username) {

        if (username.isBlank()) {
            return "Имя пользователя не может быть пустым или состоять только из пробелов";
        }
        if (username.length() < 3) {
            return "Имя пользователя не может быть менее трех символов";
        }

        if (checkStringContainsSpaces(username)) {
            return "Имя пользователя не может содержать пробелы";
        }

        return "Ok";
    }


    private String checkPassword(String password) {

        if (password.isBlank()) return "Пароль не может быть пустым или состоять только из пробелов";

        if (password.length() < 8) return "Пароль не может быть менее трех символов";

        if (checkStringContainsSpaces(password)) {
            return "Пароль не может содержать пробелы";
        }

        return "Ok";
    }

    private String checkEmail(String email) {
        if (email.isBlank() || checkStringContainsSpaces(email)) {
            return "Email не может быть пустым или состоять только из пробелов";
        }
        if (checkStringContainsSpaces(email)) {
            return "Email не может содержать пробелы";
        }
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.');
        if ((atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) == false) {
            return "Формат введенных данных не соответствует стандарту адреса электронной почты name@company.com";
        }
        return "Ok";
    }

    private String checkDescription(String description) {
        if (description.length() > 25) {
        }
        return "Ok";
    }

    private boolean checkStringContainsSpaces(String stringForCheck) {
        return stringForCheck.contains(" ");
    }
}
