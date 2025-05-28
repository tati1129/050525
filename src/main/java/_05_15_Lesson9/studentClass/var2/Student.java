package _05_15_Lesson9.studentClass.var2;

import java.util.Scanner;

public class Student {
    private String name;
    private String group;
    private String status;

    public Student(String name, String group, String status) {
        this.name = name;
        this.group = group;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getIsStudy() {
        return status;
    }



    @Override
    public String toString() {
        return "Студент " +
                "имя : " + name + '\'' +
                ", группа : " + group + '\'' +
                ", обучается : " + status +
                '}';
    }
    public void changeStatus() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter status of student : ");
        status = scanner.nextLine();
        scanner.close();
    }
}
