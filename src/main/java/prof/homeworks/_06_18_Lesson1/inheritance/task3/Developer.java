package prof.homeworks._06_18_Lesson1.inheritance.task3;

import java.util.Arrays;

public class Developer extends Employee {
    private String[] projects;

    public Developer(String name, int age, String[] projects) {
        super(name, age);
        this.projects = projects;
    }

    @Override
    public void printInfo() {
        System.out.print("Employee name : " + getName() + " age : " + getAge() + " Projects : [ " + Arrays.toString(projects) + "]");

    }
}
