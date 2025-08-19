package prof.homeworks._07_31_Lesson14.task1;
/*
 Фильтрация списка студентов по возрасту и со средним баллом больше 4.5
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ann", 23, 7.8));
        students.add(new Student("Bob", 33, 4.5));
        students.add(new Student("Antony", 28, 3.7));
        students.add(new Student("Mariam", 24, 8.8));
        students.add(new Student("Steve", 55, 7.2));
        students.add(new Student("Konan", 29, 9.1));

        filteredByAgeAndAVG(students,30,4.5);


    }

    public static void filteredByAgeAndAVG(List<Student> students, int age, double avg){
         students.stream()
                .filter(student -> student.getAge()>age && student.getAvgGrade()>=avg)
                .forEach(s -> System.out.println(s));
    }
}
