package _05_15_Lesson9.studentClass.var3;



public class StudentApp {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        Student student = new Student("Fred", "34-jh", "no");

        System.out.println("Before changing : " + student);

      service.changeStudentStatus(student);

        System.out.println("After changing : " + student);
    }
}
