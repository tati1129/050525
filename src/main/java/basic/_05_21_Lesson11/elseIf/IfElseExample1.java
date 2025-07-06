package basic._05_21_Lesson11.elseIf;

public class IfElseExample1 {
    public static void main(String[] args) {


        int userData = UserInputStatic.inputInt("Please enter ineger number");

        if (userData < 0) {
            System.out.println("Вы ввели отрицательное число!");
        } else if (userData >= 0 && userData < 100) {
            System.out.println("Вы ввели положительное число в диапазоне от 0 до 100");
        } else {
            System.out.println("Вы ввели число более или равно 100");
        }
    }
}
