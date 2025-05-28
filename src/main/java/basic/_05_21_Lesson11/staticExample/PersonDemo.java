package basic._05_21_Lesson11.staticExample;

public class PersonDemo {
    public static void main(String[] args) {
        Person personPetr = new Person();
        personPetr.name = "Petr";
        personPetr.town = "Berlin";

        Person personOlga = new Person();
        personOlga.name = "Olga";
        personOlga.town = "Leipzig";

        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

        System.out.println(personOlga.name);
        System.out.println(personOlga.town);
    }
}
