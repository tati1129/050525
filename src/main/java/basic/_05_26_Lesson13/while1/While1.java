package basic._05_26_Lesson13.while1;

import javaPro3._05_26.UserInputStatic;

public class While1 {
    public static void main(String[] args) {


        double summ = 0;
        while (summ < 100){

            double num1 = UserInputStatic.inputDouble("ВВедите 1е числа");
            double num2 = UserInputStatic.inputDouble("ВВедите 2е числа");
            summ = num1 + num2;
            System.out.println("Сумма " + num1 +" + " +num2 + " = " +summ);
        }
    }
}
