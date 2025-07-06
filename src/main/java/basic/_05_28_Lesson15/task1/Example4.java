package basic._05_28_Lesson15.task1;

import basic._05_28_Lesson15.UserInputStatic;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        int myArrSize = UserInputStatic.inputInt("Введите количество слов");

        String[] strArr = new String[myArrSize];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = UserInputStatic.inputString("Введите слово");

        }

        System.out.println(Arrays.toString(strArr));
    }
}
