package basic._05_26_Lesson13.while5;

import basic._05_26_Lesson13.UserInputStatic;

public class WhileDemo5 {
    public static void main(String[] args) {
        int summ = 0;
        boolean condition = true;
        while (condition){
            int num = UserInputStatic.inputInt("Введите целое числа");
            if (num>=0){
                summ += num;
            }else {
                condition = false;
            }

        }
        System.out.println("Итоговая сумма положительных чисел :" + summ);
    }
}
