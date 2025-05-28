package basic._05_15_Lesson8.student1;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Tom", "25-sjjg", false);
        StudentInput input = new StudentInput(scanner);
        StudentService service = new StudentService();

        System.out.println("Before changing : " + student);
        service.changeStudiesStatus(student, input);
        System.out.println("After changing : " + student);
    }
}
