package basic.homeWorks._05_09_Lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 ___________________________________");
        Shop shop = new Shop();
        shop.item1 = 1500;
        shop.item2 = 500;
        shop.shopWithDiscount();
        System.out.println();
        System.out.println("Task 2 ___________________________________");
        Temperature temperature = new Temperature();
        temperature.avgTemperature();

        System.out.println();
        System.out.println("Task 3 ___________________________________");
        Dividing dividing1 = new Dividing();
        dividing1.num = 8;
        dividing1.getDivederBy2();
        dividing1.getDivederBy3();

        System.out.println();
        System.out.println("Task 4 ___________________________________");
        Manager person1 = new Manager();
        person1.age = 33;
        person1.salary = 2009.88;
        System.out.print("Person1 -> ");
        person1.printInfoManager();

        person1.age += 1;
        System.out.print("Person1 -> ");
        person1.printInfoManager();

        Manager person2 = new Manager();
        person2.age = 38;
        person2.salary = 1980.06;
        System.out.print("Person2 -> ");
        person2.printInfoManager();

        person2.age += 1;
        System.out.print("Person2  -> ");
        person2.printInfoManager();

    }
}
