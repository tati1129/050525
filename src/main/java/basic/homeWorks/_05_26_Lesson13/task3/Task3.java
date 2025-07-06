package basic.homeWorks._05_26_Lesson13.task3;

import basic.homeWorks._05_26_Lesson13.UserInput;

public class Task3 {
    public static void main(String[] args) {
         /*
        Пользователь ввел число N.
        Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N
         */
        int userInt = UserInput.inputInt("Введите число");

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < userInt; i++) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("количество четных чисел в диапазоне от 0 до " + userInt + " = " + countEven);
        System.out.println("количество нечетных чисел в диапазоне от 0 до " + userInt + " = " + countOdd);
    }
}
