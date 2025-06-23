package prof.lessons._06_17_Lesson.hr.entity;

public class Aplicant {

    private int id;
    private Person person;
    private Department department;
    private boolean isAprove;

    public Aplicant(int id, Person person, Department department) {
        this.id = id;
        this.person = person;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Department getDepartment() {
        return department;
    }

    public boolean isAprove() {
        return isAprove;
    }

    public void setAprove(boolean aprove) {
        isAprove = aprove;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
