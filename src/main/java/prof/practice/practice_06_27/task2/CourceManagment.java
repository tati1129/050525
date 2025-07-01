package prof.practice.practice_06_27.task2;

import java.util.ArrayList;

public class CourceManagment {
    public static void main(String[] args) {
        Cource cource1 = new Cource("Java 1", " Java Basic");
        Cource cource2 = new Cource("Java 2", " Java Pro");
        Cource cource3 = new Cource("HTML", " cource HTML");
        Cource cource4 = new Cource("JS", " Java Script");
        Cource cource5 = new Cource("FE", " FrontEnd");

        Rector rector1 = new Rector("T1", "Dan");
        Rector rector2 = new Rector("T2", "Ann");

        cource1.assignRector(rector1);
        cource2.assignRector(rector2);
        cource3.assignRector(rector1);
        cource4.assignRector(rector1);
        cource5.assignRector(rector2);

        ArrayList<Cource> cources = new ArrayList<>();
        cources.add(cource1);
        cources.add(cource2);
        cources.add(cource3);
        cources.add(cource4);
        cources.add(cource5);

        ArrayList<Rector> rectors = new ArrayList<>();
        rectors.add(rector1);
        rectors.add(rector2);

        Student student1 = new Student("S1", "Student1");
        Student student2 = new Student("S2", "Student2");
        Student student3 = new Student("S3", "Student3");
        Student student4 = new Student("S4", "Student4");
        Student student5 = new Student("S5", "Student5");
        Student student6 = new Student("S6", "Student6");
        Student student7 = new Student("S7", "Student7");


    }
}
