package _05_15_Lesson9.student;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("Sam", "34-jhk", false);

        System.out.println(student);

        StudentService service = new StudentService();
        service.changeStudiesStatus(student);
        System.out.println(student);
    }
}
