package prof.homeworks._07_28_Lesson12;
import java.util.function.BinaryOperator;

/*
2. Напишите функциональный интерфейс для вычисления суммы двух целых чисел.
 */

public class Task2 {
    public static void main(String[] args) {

        BinaryOperator<Integer> getSum = (x,y) -> (x+y);

        System.out.println(getSum.apply(3,4));
        System.out.println(getSum.apply(5,6));
        System.out.println(getSum.apply(1,33));
    }
}
