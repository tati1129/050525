package basic._05_19_Lesson9.student;

public class Student {
    private String name;
    private String surname;
    private String id;
    private String group;

    public Student(String name, String surname, String id, String group) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
