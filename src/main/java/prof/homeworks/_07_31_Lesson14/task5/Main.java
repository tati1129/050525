package prof.homeworks._07_31_Lesson14.task5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 из списка студентов сгруппировать данные по году поступления

 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ann", 23,2012, 7.8));
        students.add(new Student("Bob", 33,2025, 4.5));
        students.add(new Student("Antony", 28,2021, 3.7));
        students.add(new Student("Mariam", 24, 2026,8.8));
        students.add(new Student("Steve", 55,2023, 7.2));
        students.add(new Student("Konan", 29, 2018,9.1));

 sortedByYear(students);
        System.out.println("_____________________________");
 sortedByYearByDesc(students);

    }

    public static void sortedByYearByDesc(List<Student> students){
        students.stream()
                .sorted(Comparator.comparingInt(s -> -s.getYear()))
                .forEach(s -> System.out.println(s));
    }
    public static void sortedByYear(List<Student> students){
        students.stream()
                .sorted(Comparator.comparingInt(s -> s.getYear()))
                .forEach(s -> System.out.println(s));
    }
}
