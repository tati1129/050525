package basic._05_26_Lesson13.doWhile;

import basic._05_26_Lesson13.UserInputStatic;


public class DohileWhile {
    public static void main(String[] args) {
        System.out.println("Введите текст или enter для выхода");
        String userText= "";
        do {
            userText = UserInputStatic.inputString("");
            System.out.println("Ваш текст" + userText);
        }while (!userText.isEmpty());
    }
}
