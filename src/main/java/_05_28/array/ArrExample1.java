package _05_28.array;

import java.util.Arrays;

public class ArrExample1 {
    public static void main(String[] args) {
        int[] myArr = new int[3];

        myArr[0] = 6;
        myArr[1] = 9;
        myArr[2] = 11;

        System.out.println(Arrays.toString(myArr));
        int summElem = 0;
        for (int i = 0; i < myArr.length; i++) {
            summElem += myArr[i];
        }


        String[] strArr = {"word 1","word 2","word 3","word 1"};
        System.out.println(Arrays.toString(strArr));

        System.out.println(strArr[0].equals(strArr[1]));
        System.out.println(strArr[0].equals(strArr[3]));
        System.out.println((strArr[0] + strArr[1]).length());
        System.out.println(strArr[0].length());
    }
}
