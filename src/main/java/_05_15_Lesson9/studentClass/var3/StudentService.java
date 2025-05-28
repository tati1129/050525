package _05_15_Lesson9.studentClass.var3;

import java.util.Scanner;

public class StudentService {

    public void changeStudentStatus(Student student) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a status of student");
        String newStatus = sc.nextLine();

        student.setStatus(newStatus);

        sc.close();
    }
}
