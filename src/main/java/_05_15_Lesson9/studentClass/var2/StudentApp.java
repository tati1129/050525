package _05_15_Lesson9.studentClass.var2;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("Fred", "34-jh", "no");
        System.out.println("Before changing : " + student);

        student.changeStatus();
        System.out.println("After changing : " + student);
    }
}
