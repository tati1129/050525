package basic._05_28_Lesson15.array;

import basic._05_28_Lesson15.UserInputStatic;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int patientQuantity = UserInputStatic.inputInt("Введите количество пациентов");
        String[] patients = new String[patientQuantity];

        for (int i = 0; i < patients.length; i++) {
            patients[i] = UserInputStatic.inputString("Введите имя пациента");
        }

        System.out.println("Наши пациенты : " + Arrays.toString(patients));
    }
}
