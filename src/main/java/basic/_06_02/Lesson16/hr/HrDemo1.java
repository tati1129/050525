package basic._06_02.Lesson16.hr;

import java.util.Arrays;

public class HrDemo1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Olga");
        Employee employee2 = new Employee("Tim");
        Employee employee3 = new Employee("Stive");
        Employee employee4 = new Employee("Anna");
        Employee employee5 = new Employee("MArk");

        Employee[] employeesForDep1 = {employee2, employee3};
        Employee[] employeesForDep2 = {employee4, employee5};

        Department department1 = new Department("Marketing", employeesForDep1);
        Department department2 = new Department("Accounting", employeesForDep2);
        Department[] departments = {department1, department2};
        Firm company = new Firm("DDDD", employee1, departments);

        for (int i = 0; i < company.getDepartments().length; i++) {
            Department[] myCompanyDepartments = company.getDepartments();
            System.out.println(Arrays.toString(myCompanyDepartments));

        }
    }

}
