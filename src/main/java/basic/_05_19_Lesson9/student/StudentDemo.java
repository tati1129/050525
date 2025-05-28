package basic._05_19_Lesson9.student;

import javaPro3._05_19.UserInput;

public class StudentDemo {
    public static void main(String[] args) {
        UserInput input = new UserInput();

        String studentName1 = input.inputText("Enter student name");
        String studentSurname1 = input.inputText("Enter student surname");
        String studentID1 = input.inputText("Enter student id");
        String studentGroup1 = input.inputText("Enter student group");
        Student student1 = new Student(studentName1,studentSurname1,studentID1,studentGroup1);

        String studentName2 = input.inputText("Enter student name");
        String studentSurname2 = input.inputText("Enter student surname");
        String studentID2 = input.inputText("Enter student id");
        String studentGroup2 = input.inputText("Enter student group");
        Student student2 = new Student(studentName2,studentSurname2,studentID2,studentGroup2);

        String studentName3 = input.inputText("Enter student name");
        String studentSurname3 = input.inputText("Enter student surname");
        String studentID3 = input.inputText("Enter student id");
        String studentGroup3 = input.inputText("Enter student group");
        Student student3 = new Student(studentName3,studentSurname3,studentID3,studentGroup3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
