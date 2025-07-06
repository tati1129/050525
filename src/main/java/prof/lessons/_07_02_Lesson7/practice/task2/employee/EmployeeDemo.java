package prof.lessons._07_02_Lesson7.practice.task2.employee;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(3, "Alex", 5000, "HR"));
        employees.add(new Employee(1, "Andrew", 7000, "IT"));
        employees.add(new Employee(2, "Ruslan", 6000, "Finance"));
        employees.add(new Employee(4, "David", 5500, "HR"));

// Сортировка по ID (Comparable)
        Collections.sort(employees);
        System.out.println("Sorted by Employee ID:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

//Сортировка по отделу и ID (Комбинированный Comparator)
        Collections.sort(employees, new ComparatorByDepAndId());
        ;
        System.out.println("by Department and Employee ID :");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка по зарплате (Comparator)
        Collections.sort(employees, new ComparatorBySalary());
        System.out.println("Sorted by Salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        // Сортировка по отделу и имени (Комбинированный Comparator)

        Collections.sort(employees, new ComparatorByNameAndDep());
        System.out.println("\nSorted by Department and Name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
