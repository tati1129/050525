package basic.homeWorks._06_02_Lesson16.student.var2;


public class Service {


    public Student[] createSudents() {
        Student student1 = new Student("Ann", "Group1");
        Student student2 = new Student("Tomm", "Group1");
        Student student3 = new Student("Alex", "Group1");
        Student student4 = new Student("Stive", "Group1");
        Student student5 = new Student("Arnold", "Group1");

        Student[] students = {student1, student2, student3, student4, student5};
        return students;
    }

    public void changeStudentGroup(Student[] students, String studentName, String groupName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(studentName)) {
                students[i].setGroupName(groupName);
                System.out.println("Группа студента " + studentName + " изменена на " + groupName);
                return;
            }
        }
        System.out.println("Студент с именем " + studentName + " не найден.");

    }

    public Group createGroup(Student[] students, String groupName) {
        int count = 0;

// Считаем количество студентов в нужной группе
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroupName().equals(groupName)) {
                count++;
            }
        }
        // Создаем массив нужного размера
        Student[] newList = new Student[count];
        int index = 0;
        for (int i = 0; i < students.length; i++) {

            if (students[i].getGroupName().equals(groupName)) {
                newList[index] = students[i];
                index++;
            }
        }
        return new Group(groupName, newList);
    }

    public void printStudentsInGroup(Student[] allStudents, Group group) {
        System.out.print("Group " + group.getGroupName() + ": [");
        boolean first = true;
        for (Student student : allStudents) {
            if (student.getGroupName().equals(group.getGroupName())) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(student.getName());
                first = false;
            }
        }
        System.out.println("]");
    }
}
