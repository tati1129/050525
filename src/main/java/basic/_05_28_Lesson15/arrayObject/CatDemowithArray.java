package basic._05_28_Lesson15.arrayObject;

public class CatDemowithArray {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murz");
        Cat cat2 = new Cat("Bars");
        Cat cat3 = new Cat("Lucky");

        Cat[] cats = {cat1,cat2,cat3};
        System.out.println("У нас живут : ");
        System.out.println(cats[0].getName());
        System.out.println(cats[1].getName());
        System.out.println(cats[2].getName());

        System.out.println("Or with fori");

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName());

        }
    }
}
