package basic._05_19_Lesson9.studentWithgroup;

import basic._05_26_Lesson13.UserInputStatic;


public class StudentService {
    public Group createNewGroup(){
        UserInputStatic input = new UserInputStatic();

        String groupName = UserInputStatic.inputString("Ведите название группы: ");
        String startDate = UserInputStatic.inputString("Ведите начало обучения: ");
        int countStudent = UserInputStatic.inputInt("Ведите количество студентов: ");
        Group group = new Group(groupName, startDate, countStudent);
        return  group;
    };

    public Student createNeStudent(Group group){


        String studentName = UserInputStatic.inputString("Введиту имя студента : ");
        String idCard = UserInputStatic.inputString("Введите id карту : ");

        Student student = new Student(studentName,idCard,group);
        return student;
    };

}
