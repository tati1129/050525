package prof.lessons._07_02_Lesson7.practice.task2.employee;

import java.util.Comparator;

public class ComparatorBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());//по возрастанию
//        return (-1) * Double.compare(o1.getSalary(), o2.getSalary());//по убыванию
//        return Double.compare(o2.getSalary(), o1.getSalary());//по убыванию


    }
}
