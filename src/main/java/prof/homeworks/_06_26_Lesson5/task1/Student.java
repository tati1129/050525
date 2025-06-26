package prof.homeworks._06_26_Lesson5.task1;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return  name;
    }
}
