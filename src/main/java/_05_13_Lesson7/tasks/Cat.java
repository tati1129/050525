package _05_13_Lesson7.tasks;

public class Cat {
    String name;
    int age;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Cat() {

    }

    public void printInfo(String name, int age){
        System.out.println("Cat " + name+ ", age : " + age );

    }
    public void celebrate(String name){
        System.out.println("Today's birthday cat " + name );
    }
}
