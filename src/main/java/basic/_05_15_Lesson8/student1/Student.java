package basic._05_15_Lesson8.student1;

public class Student {
    private String name;
    private String group;
    private boolean isStudy;

    public Student(String name, String group, boolean isStudy) {
        this.name = name;
        this.group = group;
        this.isStudy = isStudy;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public boolean isStudy() {
        return isStudy;
    }

    public void setStudy(boolean study) {
        isStudy = study;
    }

    @Override
    public String toString() {
        return "Студент " +
                "имя : " + name + '\'' +
                ", группа : " + group + '\'' +
                ", обучается : " + isStudy +
                '}';
    }
}
