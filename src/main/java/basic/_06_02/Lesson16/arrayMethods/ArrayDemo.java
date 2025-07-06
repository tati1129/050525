package basic._06_02.Lesson16.arrayMethods;

import basic._06_02.Lesson16.UserInputStatic;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[UserInputStatic.inputInt("Введите длину массива")];

        int startValue = UserInputStatic.inputInt("Введите начало диапазона массива");
        int endValue = UserInputStatic.inputInt("Введите конец диапазона массива");

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(endValue + 1) + startValue;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }


    }
}
