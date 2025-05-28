package basic._05_13_Lesson6.tasks;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Melody";
        cat.age = 3;

        cat.printInfo(cat.name, cat.age);

        cat.age += 1;
        cat.celebrate(cat.name);

        cat.printInfo(cat.name, cat.age);
    }
}
