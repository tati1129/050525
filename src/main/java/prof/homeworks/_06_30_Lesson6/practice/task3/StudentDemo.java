package prof.homeworks._06_30_Lesson6.practice.task3;

public class StudentDemo {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        management.addStudent(1, "Ann");
        management.addGrade(1, "QA", 9);
        management.addGrade(2, "SQL", 11);
        management.addGrade(13, "Git", 10);
        management.getAverageGrade(1);
    }


}
