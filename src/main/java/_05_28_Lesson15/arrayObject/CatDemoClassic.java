package _05_28_Lesson15.arrayObject;

import _05_28_Lesson15.UserInputStatic;

public class CatDemoClassic {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murz");
        Cat cat2 = new Cat("Bars");
        Cat cat3 = new Cat("Lucky");

        System.out.println("У нас живут : ");
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());
        System.out.println(cat3.getName());

        int catNum = UserInputStatic.inputInt("Выберите кота 1,2 или 3");

        switch (catNum){
            case 1 -> System.out.println(cat1.getName());
            case 2 -> System.out.println(cat2.getName());
            case 3 -> System.out.println(cat3.getName());
            default -> System.out.println("Error");
        }
    }


}
