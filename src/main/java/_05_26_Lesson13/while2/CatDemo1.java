package _05_26_Lesson13.while2;

import javaPro3._05_26.UserInputStatic;

public class CatDemo1 {
    public static void main(String[] args) {
       /*
        создайте несколько экземпляров (например три) класса Cat для регистрации в ветеринарной клинике
         */

        String catName1 = UserInputStatic.inputString("Введите имя первой кошки: ");
        Cat cat1 = new Cat(catName1);
        System.out.println("Кошка: " + cat1.getName() + " зарегистрирована в журнале");

        String catName2 = UserInputStatic.inputString("Введите имя первой кошки: ");
        Cat cat2 = new Cat(catName2);
        System.out.println("Кошка: " + cat2.getName() + " зарегистрирована в журнале");

        String catName3 = UserInputStatic.inputString("Введите имя первой кошки: ");
        Cat cat3 = new Cat(catName3);
        System.out.println("Кошка: " + cat3.getName() + " зарегистрирована в журнале");

    }
}
