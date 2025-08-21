package prof.homeworks._07_28_Lesson12;
/*Напишите функциональный интерфейс для вычисления факториала числа.

 */

import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {

        Function<Integer,Integer> factorial = n -> {
            int result = 1;
            for (int i = 2; i <= n ; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.apply(3));
    }
}
