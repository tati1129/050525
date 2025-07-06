package prof.lessons._07_02_Lesson7.practice.task2.employee;

import java.util.Comparator;

public class ComparatorById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
