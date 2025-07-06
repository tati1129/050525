package basic._06_02.Lesson16.cloneArray.var1;

import java.util.Arrays;

public class CopyArrExample2 {
    public static void main(String[] args) {

        Cat[] array = {new Cat("Amm"), new Cat("Sss"), new Cat("Rrff")};
        Cat[] newArray = array.clone();


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

        array[1].setName("Рыжик");

        System.out.println("after change");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));


    }
}
