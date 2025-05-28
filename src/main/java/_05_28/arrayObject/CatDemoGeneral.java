package _05_28.arrayObject;

import _05_28.UserInputStatic;

import java.util.Arrays;

public class CatDemoGeneral {
    public static void main(String[] args) {
        int catsQuantity = UserInputStatic.inputInt("Введите количество питомцев :");

        Cat[] cats = new Cat[catsQuantity];

        for (int i = 0; i <cats.length ; i++) {
            String catName = UserInputStatic.inputString("Введите имя кота!");
            Cat cat = new Cat(catName);
            cats[i] = cat;
        }

        System.out.println(Arrays.toString(cats));
    }
}
