package basic._05_27_Lesson14.task6;

import basic._05_27_Lesson14.UserInputStatic;

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
        ValidationResult validationResult = null;

        while (!checkResult) {
            userdata = UserInputStatic.inputString("Ведите " + fieldName);

            switch (fieldName) {
                case "имя пользователя" -> validationResult = InputDataValidation.checkUsername(userdata);
                case "пароль" -> validationResult = InputDataValidation.checkPassword(userdata);
                case "email" -> validationResult = InputDataValidation.checkEmail(userdata);
                case "описание" -> validationResult = InputDataValidation.checkDescription(userdata);
            }

            if (validationResult.getCodeError() == 200) {
                checkResult = true;
            } else {
                System.out.println("Введенное " + fieldName + " не соответствует формату.");
                System.out.println(validationResult.getErrorDescription() + " Повторите ввод данных.");
            }
        }
        return userdata;
    }
}
