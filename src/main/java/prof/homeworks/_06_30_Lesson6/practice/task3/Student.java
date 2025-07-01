package prof.homeworks._06_30_Lesson6.practice.task3;

import java.util.HashMap;
import java.util.Objects;

public class Student {
    private String name;
    private Integer ID;
    HashMap<String, Integer> schoolSubject;

    public Student(String name, Integer ID) {
        this.name = name;
        this.ID = ID;
        schoolSubject = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Integer getID() {
        return ID;
    }

    public HashMap<String, Integer> getSchoolSubject() {
        return schoolSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(ID, student.ID) && Objects.equals(schoolSubject, student.schoolSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID, schoolSubject);
    }
}
