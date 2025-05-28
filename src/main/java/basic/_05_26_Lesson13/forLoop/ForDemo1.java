package basic._05_26_Lesson13.forLoop;

import javaPro3._05_26.UserInputStatic;

public class ForDemo1 {
    public static void main(String[] args) {
        int userInputCount = UserInputStatic.inputInt("Введите количество цифр, которые вы введете");
int summ = 0;
        for (int i = 0; i < userInputCount; i++) {
            int num = UserInputStatic.inputInt("Введите число");
            if (num>0){
                summ += num;
            }
        }
        System.out.println("Сумма чисел : " + summ);
    }
}
