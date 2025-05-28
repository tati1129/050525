package _05_27_Lesson14.task4;

import _05_27_Lesson14.UserInputStatic;

public class Main1 {
    public static void main(String[] args) {
        /*
            Проверить является ли число которое ввел пользователь - простым
           (Простое чило - число, которое делится без остатка только на 1 и на себя)
         */

        int userNum = UserInputStatic.inputInt("Введите число для проверки");

        boolean isSimple = true;

        for (int i = 2; i < userNum; i++) {
            if (userNum % i == 0){
                isSimple = false;
                break;
            }
            if (isSimple){
                System.out.println("Число " + userNum + " является простым");
            }else {
                System.out.println("Число " + userNum + " не является простым");
            }

        }
    }
}
