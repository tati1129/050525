package basic._06_02.Lesson16.hr;

import java.util.Arrays;

public class Department {
    private String departmentName;
    private Employee[] employees;

    public Department(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
