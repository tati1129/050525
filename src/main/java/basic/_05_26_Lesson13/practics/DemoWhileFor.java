package basic._05_26_Lesson13.practics;

import basic._05_26_Lesson13.UserInputStatic;

public class DemoWhileFor {
    public static void main(String[] args) {
        String text = UserInputStatic.inputString("Введите текст");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(" " + text.charAt(i));
        }
        int counter= 0;
        while (counter<text.length()){
            System.out.print(" " + text.charAt(counter));
            counter++;
        }
    }
}
