package basic._05_26_Lesson13.practics;

import basic._05_26_Lesson13.UserInputStatic;

public class Task1 {
    //Запросите у пользователя несколько чисел, до тех пор пока от не введет отрицательное нечетное число
    //напечатайте введенное пользователем число или завершите работу


    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {
            int num = UserInputStatic.inputInt("Введите целое положительное числа");
            if (num > 0 && num % 2 == 0) {
                System.out.println(num);
            } else {
                System.out.println("Число отрицательное и нечетное : " + num);
                condition = false;
            }

        }
    }
}
