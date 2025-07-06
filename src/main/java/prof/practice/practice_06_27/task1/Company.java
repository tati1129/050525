package prof.practice.practice_06_27.task1;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        Department sales = new Department("Sales");
        Department accounting = new Department("Accounting");
        Department administration = new Department("Administration");

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(sales);
        departments.add(accounting);
        departments.add(administration);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("001", "Oga", administration));
        employees.add(new Employee("002", "Ann", sales));
        employees.add(new Employee("003", "Sam", sales));
        employees.add(new Employee("004", "Steve", accounting));

        for (int i = 0; i < employees.size(); i++) {
            Employee currentEmployee = employees.get(i);
            System.out.println("Employee " + currentEmployee.getName() + " work in : " + currentEmployee.getDepartment());
        }

        for (Department currentDep : departments) {
            System.out.println("Department  " + currentDep.getDepartmentTitle() + " : ");
            for (Employee currentEmp : employees) {
                if (currentEmp.getDepartment().equals(currentDep)) {
                    System.out.println(currentEmp.getName() + " ");
                }
            }


        }
    }

}
