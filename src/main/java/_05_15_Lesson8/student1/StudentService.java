package _05_15_Lesson8.student1;

import javaPro3._05_15.student1.Student;
import javaPro3._05_15.student1.StudentInput;

public class StudentService {

    public void changeStudiesStatus(Student student, StudentInput input){
        input.inputBoolean("Do you want to change studie status? (y/n)", student);
    }
}
