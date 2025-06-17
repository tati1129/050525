package prof.homeworks.lesson1.task2;

public class Main {
    public static void main(String[] args) {
        StudentsRepository repository = new StudentsRepository();
        StudentService service = new StudentService(repository);

        Student[] students = service.createStudentFromUserInput();
        Student[] sortedStudents = service.sortByLastName(students);
        service.printAll(sortedStudents);

    }
}
