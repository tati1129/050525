package basic._05_26_Lesson13;

public class Example1 {
    public static void main(String[] args) {
        int num1 = UserInputStatic.inputInt("Введите 1е число");
        int num2 = UserInputStatic.inputInt("Введите 2е число");
        int num3 = UserInputStatic.inputInt("Введите 3е число");

        double avgNun = (num1 + num2 + num3) / 3.0;
        System.out.println("Среднее арифметическое -" + avgNun);
    }
}
