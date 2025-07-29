package prof.lessons._07_28_Lesson12.standartFunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> halfOfSqrt = x -> Math.sqrt(x) /2;
        System.out.println(halfOfSqrt.apply(9));
        System.out.println(halfOfSqrt.apply(16));
        System.out.println(halfOfSqrt.apply(25));
    }
}
