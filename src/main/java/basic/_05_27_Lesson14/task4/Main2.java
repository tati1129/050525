package basic._05_27_Lesson14.task4;

import basic._05_27_Lesson14.UserInputStatic;

public class Main2 {
    public static void main(String[] args) {
        /*
           Запросите у пользователя число N и выведите ВСЕ простые числа от 1 до N
         */

        int userNum = UserInputStatic.inputInt("Введите число для проверки");


        for (int i = 2; i < userNum; i++) {
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
