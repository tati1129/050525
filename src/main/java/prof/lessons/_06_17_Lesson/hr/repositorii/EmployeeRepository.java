package prof.lessons._06_17_Lesson.hr.repositorii;


import prof.lessons._06_17_Lesson.hr.entity.Employee;

public class EmployeeRepository {

    private Employee[] employees;
    private int counterEmployee = 0;

    public EmployeeRepository(int quantity) {
        this.employees = new Employee[quantity];
    }

    public String save(Employee employee) {
        if (counterEmployee < employees.length) {
            employees[counterEmployee++] = employee;
            return "Новый сотрудник создан успешно";
        }
        return "Добавить сотрудника не удалось.";
    }

    public Employee findByID(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == i) {
                return employees[i];
            }
        }
        return null;
    }

    // если имя сотрудника является уникальным и не может повториться
    public Employee findByPersonName(String name) {
        for (int i = 0; i < counterEmployee; i++) {
            if (employees[i].getPerson().getName().equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee[] findAll() {
        Employee[] allFill = new Employee[counterEmployee];
        for (int i = 0; i < counterEmployee; i++) {
            allFill[i] = employees[i];
        }
        return allFill;
    }
}
