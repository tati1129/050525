package basic._06_04_Lesson18._06_04_Lesson18_home;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        shuffleArr(arr);
        findNum(arr, 7);
    }

    public static void shuffleArr(int[] arr) {

        Random random = new Random();

        for (int i = arr.length-1; i > 0; i--) {
            int rand = random.nextInt(arr.length + 1);
            int temp = arr[rand];
            arr[rand] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void findNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Num " + num + " on " + i + " position now");
                ;
            }
        }
    }
}
