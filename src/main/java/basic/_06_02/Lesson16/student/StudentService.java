package basic._06_02.Lesson16.student;

public class StudentService {

    public Student[] createSudents() {
        Student student1 = new Student("Ann");
        Student student2 = new Student("Tomm");
        Student student3 = new Student("Alex");
        Student student4 = new Student("Stive");
        Student student5 = new Student("Arnold");

        Student[] students = {student1, student2, student3, student4, student5};
        return students;
    }


    public int findNames(Student[] students, char leter) {
        int count = 0;
        char letter =Character.toLowerCase(leter);
        for (int i = 0; i < students.length; i++) {
            String name = students[i].getName().toLowerCase();
            if (Character.toLowerCase(name.charAt(0)) == Character.toLowerCase(leter)) {
                count++;

            }
            ;
        }
        if (count == 0) {
            System.out.println("Нет студентов с именем на букву " + leter);
        }
        System.out.println("Найдено " + count +" студентов с именем начинающимся на букву "+ leter);
        return count;

    }

    public void printNAmes(Student[] students, char leter) {
        for (int i = 0; i < students.length; i++) {
            String name = students[i].getName();
            if (name.charAt(0) == leter) {
                System.out.print(students[i] + ", ");
            }
            ;
        }
    }

}
