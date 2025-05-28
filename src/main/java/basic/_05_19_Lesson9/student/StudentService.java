package basic._05_19_Lesson9.student;

import javaPro3._05_19.UserInput;

public class StudentService {
    public Student createStudent(){
        UserInput service = new UserInput();

        String name = service.inputText("Enter name : ");
        String surname = service.inputText("Enter surname : ");
        String id = service.inputText("Enter id : ");
        String group = service.inputText("Enter a group : ");

        Student student = new Student(name,surname,id,group);
        return  student;
    }



}
