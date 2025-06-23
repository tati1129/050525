package prof.homeworks._06_18_Lesson1.inheritance.task3;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo(){
        System.out.println("Employee : " + name + " age " + age);
    }
}
