package basic._06_02.Lesson16.arrayMethods;

import basic._06_02.Lesson16.UserInputStatic;

import java.util.Random;

public class ArrayService {
    Random random = new Random();

    public int[] createArr(int size) {
        int[] arrInt = new int[size];
        return arrInt;
    }

    public void fillArrByRandom(int startValue, int endValue, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(endValue + 1) + startValue;
        }
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] fillArrByUser() {
        int size = UserInputStatic.inputInt("Введите длину массива");
        int startValue = UserInputStatic.inputInt("Введите начало диапазона массива");
        int endValue = UserInputStatic.inputInt("Введите конец диапазона массива");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(endValue + 1) + startValue;
        }
        return arr;
    }


}
