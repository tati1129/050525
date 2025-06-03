package basic._06_02.Lesson16.cloneArray.var2;

import java.util.Arrays;

public class CopyArrExample2 {
    public static void main(String[] args) {

        Cat[] array= {new Cat("Amm"),new Cat("Sss"), new Cat("Rrff")};
        Cat[] newArray=new Cat[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

        array[1].setName("Рыжик");

        System.out.println("after change");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));


    }
}
