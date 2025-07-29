package prof.lessons._07_28_Lesson12.standartFunctionalInterfaces;

import basic._05_26_Lesson13.UserInputStatic;

import java.util.function.Supplier;

public class SuplierExample2 {
    public static void main(String[] args) {

        Supplier<Cat> createCat = () -> {
            String name = UserInputStatic.inputString("Введите имя вашего питомца");
            return new Cat(name);
        };


        for (int i = 0; i < 3; i++) {
            System.out.println(createCat.get());
        }
    }
}
