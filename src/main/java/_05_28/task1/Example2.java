package _05_28.task1;

import _05_28.UserInputStatic;

public class Example2 {
    public static void main(String[] args) {
        int patientQuantity = 5;


        int currentNum = 3;
        for (int i = 0; i < patientQuantity; i++) {
            String patientName = UserInputStatic.inputString("Введите имя пациента");
        }

    }
}
