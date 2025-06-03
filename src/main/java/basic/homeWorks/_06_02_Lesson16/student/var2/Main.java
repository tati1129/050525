package basic.homeWorks._06_02_Lesson16.student.var2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Student[] students = service.createSudents();
        Group group1 = service.createGroup(students, "Group1");
        Group group2 = service.createGroup(students, "Group2");

        service.printStudentsInGroup(students, group1);
        service.printStudentsInGroup(students, group2);


        service.changeStudentGroup(students, "Ann", "Group2");
        service.changeStudentGroup(students, "Stive", "Group2");

        service.printStudentsInGroup(students, group1);
        service.printStudentsInGroup(students, group2);

    }
}
