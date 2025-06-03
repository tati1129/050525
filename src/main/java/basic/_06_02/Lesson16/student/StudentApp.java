package basic._06_02.Lesson16.student;

public class StudentApp {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student[] students = service.createSudents();

        service.findNames(students, 'A');
        service.printNAmes(students, 'A');
    }
}
