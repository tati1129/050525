package _05_15_Lesson8.studentClass.var3;

public class Student {
    private String name;
    private String group;
    private String status;

    public Student(String name, String group, String status) {
        this.name = name;
        this.group = group;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Студент " +
                "имя : " + name + '\'' +
                ", группа : " + group + '\'' +
                ", обучается : " + status +
                '}';
    }
}
