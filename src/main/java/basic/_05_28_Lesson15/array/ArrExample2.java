package basic._05_28_Lesson15.array;

import java.util.Arrays;

public class ArrExample2 {
    public static void main(String[] args) {
        int[] firstArr = {10,20,30,40,50,60,70,80,90,100};

        int[] secondArr = new int[firstArr.length];
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = firstArr[i]/10;
        }

        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
    }
}
