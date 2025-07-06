package basic._06_02.Lesson16.hr;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public Employee(String name) {
        this.name = name;
    }
}
