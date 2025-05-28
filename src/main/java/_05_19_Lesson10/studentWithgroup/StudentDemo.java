package _05_19_Lesson10.studentWithgroup;

public class StudentDemo {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        Group group1 = service.createNewGroup();
        Student student = service.createNeStudent(group1);

        System.out.println(student);
        System.out.println(group1);
    }
}
