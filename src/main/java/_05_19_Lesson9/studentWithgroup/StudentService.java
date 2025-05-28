package _05_19_Lesson9.studentWithgroup;

import javaPro3._05_19.UserInput;

public class StudentService {
    public Group createNewGroup(){
        UserInput input = new UserInput();

        String groupName = input.inputText("Ведите название группы: ");
        String startDate = input.inputText("Ведите начало обучения: ");
        int countStudent = input.inputInt("Ведите количество студентов: ");
        Group group = new Group(groupName, startDate, countStudent);
        return  group;
    };

    public Student createNeStudent(Group group){
        UserInput input = new UserInput();

        String studentName = input.inputText("Введиту имя студента : ");
        String idCard = input.inputText("Введите id карту : ");

        Student student = new Student(studentName,idCard,group);
        return student;
    };

}
