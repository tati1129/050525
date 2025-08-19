package prof.homeworks._07_31_Lesson14.task6;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static int counter = 0;
    private int id;
    private String name;
    private int age;
    List<String> skills;

    public Person(String name, int age) {
        this.id = ++counter;
        this.name = name;
        this.age = age;
        this.skills = new ArrayList<>();
    }

    public Person(String name, int age, List<String> skills) {
        this.id = ++counter;
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public void addSkill(String skill){
        skills.add(skill);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}
