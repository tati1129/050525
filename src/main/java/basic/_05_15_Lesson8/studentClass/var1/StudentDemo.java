package basic._05_15_Lesson8.studentClass.var1;

import javaPro3._05_15.studentClass.var1.Student;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ann" ,"65-utgd", "зачислен");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter status of student : ");
        String newStatus = scanner.nextLine();

        System.out.println("Before changing  " + student1);
        student1.changeStatus(newStatus);
        System.out.println("After changing  " + student1);

    }
}
