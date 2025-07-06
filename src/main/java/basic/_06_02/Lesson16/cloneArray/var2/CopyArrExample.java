package basic._06_02.Lesson16.cloneArray.var2;

import java.util.Arrays;

public class CopyArrExample {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

        newArray[0] = 10;
        System.out.println("after change");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }
}
