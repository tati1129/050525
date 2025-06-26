package prof.homeworks._06_26_Lesson5.task1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Samuel"));
        students.add(new Student("Antony"));
        students.add(new Student("Bill"));
        students.add(new Student("Madalin"));
        students.add(new Student("Jack"));

        // Collections.sort(students);
        System.out.println(students);

        reversedList(students);
        students.remove(4);
        // students.remove(new Student("Jack"));
        Collections.sort(students);


        System.out.println(students);


    }

    public static void reversedList(ArrayList<Student> students) {
        ArrayList<Student> newList = new ArrayList<>(students.size());
        int index = 0;
        for (int i = students.size() - 1; i >= 0; i--) {
            newList.add(students.get(i));
        }
        System.out.println(newList);
    }
}
