package prof.practice.practice_06_27.task1;

import java.util.Objects;

public class Employee {
    private String personalCode;
    private String name;
    private Department department;


    public Employee(String personalCode, String name, Department department) {
        this.personalCode = personalCode;
        this.name = name;
        this.department = department;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(personalCode, employee.personalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(personalCode);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personalCode='" + personalCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
