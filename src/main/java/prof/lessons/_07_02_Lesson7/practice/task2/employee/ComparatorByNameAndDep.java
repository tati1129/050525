package prof.lessons._07_02_Lesson7.practice.task2.employee;

import java.util.Comparator;

public class ComparatorByNameAndDep implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getDepartment().compareTo(o2.getDepartment());
        }
        return result;
    }
}
