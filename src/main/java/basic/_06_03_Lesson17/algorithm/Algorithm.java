package basic._06_03_Lesson17.algorithm;

import java.util.Random;

public class Algorithm {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();
            System.out.print(numbers[i] + " ");
        }
    }
}
