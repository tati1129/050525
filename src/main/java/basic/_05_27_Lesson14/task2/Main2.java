package basic._05_27_Lesson14.task2;

import basic._05_27_Lesson14.UserInputStatic;

public class Main2 {
    public static void main(String[] args) {
        /*
        запросите у пользователя пароль
        продолжать запрашивать до тех пор, пока пользователь не введет корректный

         */
        String correctPassword = "Pass12345";
        String userPassword = "";

        do {
            userPassword = UserInputStatic.inputString("Введите пароль : ");
            if (!correctPassword.equals(userPassword)) {
                System.out.println("Вы ввели не корректный пароль");
            }
        } while (!correctPassword.equals(userPassword));
        System.out.println("Пароль принят");
    }
}
