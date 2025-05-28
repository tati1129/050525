package _05_22_Lesson12;

public class StudentUtil {
    public static Student createStudent(String message){
        System.out.println(message);
        String lastName = UserInputStatic.inputString("Введите фамилию студента");
        String firstName = UserInputStatic.inputString("Введите имя студента");
        String group = UserInputStatic.inputString("Введите группу студента");
        String  idNum = UserInputStatic.inputString("Введите id номер студента");

        Student student = new Student(lastName,firstName,idNum,group);
        return student;
    }
}
