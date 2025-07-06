package basic._05_27_Lesson14.task3;

import basic._05_27_Lesson14.UserInputStatic;

public class Main {
    public static void main(String[] args) {
        String correctPassword = "Pass12345";
        String userPassword = "";
        int counter = 5;
        boolean isAccsepted = false;
        while (!correctPassword.equals(userPassword)) {
            userPassword = UserInputStatic.inputString("Введите пароль : ");
            if (!correctPassword.equals(userPassword)) {
                System.out.println("Вы ввели не корректный пароль");
                counter--;
            } else {
                isAccsepted = true;
            }
            if (counter == 0) {
                System.out.println("Вы использовали все попытки");
                break;
            }

        }

        if (isAccsepted) {
            System.out.println("Пароль принят");
        } else {
            System.out.println("Доступ закрыт!");
        }

    }
}
