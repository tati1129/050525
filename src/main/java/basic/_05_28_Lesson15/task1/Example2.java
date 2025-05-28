package basic._05_28_Lesson15.task1;

import basic._05_28_Lesson15.UserInputStatic;

public class Example2 {
    public static void main(String[] args) {
        int patientQuantity = 5;


        int currentNum = 3;
        for (int i = 0; i < patientQuantity; i++) {
            String patientName = UserInputStatic.inputString("Введите имя пациента");
        }

    }
}
