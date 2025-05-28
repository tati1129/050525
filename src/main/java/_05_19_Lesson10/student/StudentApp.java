package _05_19_Lesson10.student;

public class StudentApp {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        Student student1 = service.createStudent();
        Student student2 = service.createStudent();
        Student student3 = service.createStudent();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
