package prof.lessons._07_28_Lesson12.standartFunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample2 {
    public static void main(String[] args) {
        Function<String, Cat> newCat = name -> new Cat(name);
        System.out.println("Имя Мурз " +  newCat.apply("Мурз"));
        System.out.println("Имя Барсик " +  newCat.apply("Барсик"));
    }
}
