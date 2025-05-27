package _05_27.task4;

import _05_27.UserInputStatic;

public class Main3 {
    public static void main(String[] args) {
    /*
           Запросите у пользователя диапазон чисел и выведите ВСЕ простые числа в этом диапазоне
         */

        int userNum1 = UserInputStatic.inputInt("Введите начало диапазона ");
        int userNum2 = UserInputStatic.inputInt("Введите конец диапазона");


        for (int i = userNum1; i < userNum2; i++) {
            if (isNumSimple(i)) {
                System.out.print(" "+i);
            }
        }
    }

    public static boolean isNumSimple(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}