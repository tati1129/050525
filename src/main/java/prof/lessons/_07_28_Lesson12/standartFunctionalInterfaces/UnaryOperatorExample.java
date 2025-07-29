package prof.lessons._07_28_Lesson12.standartFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;

        System.out.println("Квадрат числа 9 = " + square.apply(9));
        System.out.println("Квадрат числа 16 = " + square.apply(16));
        System.out.println("Квадрат числа 25 = " + square.apply(25));
    }
}
