package prof.lessons._07_28_Lesson12.standartFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Double> div = (x,y) -> x /y;

        System.out.println("Деление чисел  9 на 3 = " + div.apply(9.0,3.0));

    }
}
