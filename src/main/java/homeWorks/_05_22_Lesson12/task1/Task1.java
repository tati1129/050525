package homeWorks._05_22_Lesson12.task1;

import homeWorks._05_22_Lesson12.UserInputStatic;

public class Task1 {
    public static void main(String[] args) {
        //Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
        //а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3

        int userData = UserInputStatic.inputInt("Введите одно из предложенных чисел : 1, 2 или 3");
        String answer = UserInputStatic.inputText("Введите еще раз");

        if (userData > 1 && userData < 3) {
            if (userData == 1) {
                System.out.println("Вы ввели число 1 ");
            } else if (userData == 2) {
                System.out.println("Вы ввели число 2 ");
            } else {
                System.out.println("Вы ввели число 3 ");
            }
        } else {
            System.out.println("Вы ввели некорректное число.");
            System.out.println();
        }
    }
}
