package basic.homeWorks._06_02_Lesson16.student.var1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Anna", "Group1");
        Student student2 = new Student("Maria", "Group1");
        Student student3 = new Student("Tom", "Group2");
        Student student4 = new Student("Stive", "Group1");
        Student student5 = new Student("Peter", "Group2");

        Student[] students = {student1,student2,student3,student4,student5};

        Student[] group1Students = {student1, student2, student4};
        Student[] group2Students = {student3, student5};

        Group group1 = new Group("Group1", group1Students);
        Group group2 = new Group("Group2", group2Students);



        System.out.println(group1);
        System.out.println(group2);
    }
}
