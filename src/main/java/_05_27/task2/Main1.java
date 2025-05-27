package _05_27.task2;

import _05_27.UserInputStatic;

public class Main1 {
    public static void main(String[] args) {
           /*
        запросите у пользователя пароль
        продолжать запрашивать до тех пор, пока пользователь не введет корректный

         */
        String correctPassword = "Pass12345";
        String userPassword = "";

        while (!correctPassword.equals(userPassword)){
            userPassword = UserInputStatic.inputString("Введите пароль : ");
            if (!correctPassword.equals(userPassword)){
                System.out.println("Вы ввели не корректный пароль");
            }
            System.out.println("Пароль принят");

        }
    }
}
