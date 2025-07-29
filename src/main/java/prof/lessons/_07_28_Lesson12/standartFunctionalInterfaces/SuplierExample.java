package prof.lessons._07_28_Lesson12.standartFunctionalInterfaces;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {

        Supplier<Integer> myRandomValueLess100 = () -> {
            double random = Math.random();
            random = random *100;
            return (int) random;
        };


        for (int i = 0; i < 10; i++) {
            System.out.println(myRandomValueLess100.get());
        }
    }
}
