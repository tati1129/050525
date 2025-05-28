package basic._05_28_Lesson15.array.arrayOperations;

import java.util.Arrays;

public class ChangeArrElem {
    public static void main(String[] args) {
        int[] array = {5,2,7,9,12,4,3,25,8,11};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
