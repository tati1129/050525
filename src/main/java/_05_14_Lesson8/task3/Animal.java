package _05_14_Lesson8.task3;

public class Animal {
    private String type;
    private String breed;
    private String name;
    private int age;

    public Animal(String type, String breed, String name, int age) {
        this.type = type;
        this.breed = breed;
        this.name = name;
        this.age = age;


    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
