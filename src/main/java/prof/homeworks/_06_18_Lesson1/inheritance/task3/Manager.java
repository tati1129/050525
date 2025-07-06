package prof.homeworks._06_18_Lesson1.inheritance.task3;

public class Manager extends Employee {

    private Employee[] employees;

    public Manager(String name, int age, Employee[] employees) {
        super(name, age);
        this.employees = employees;
    }

    @Override
    public void printInfo() {
        System.out.println("Manager name: " + getName() + ", age: " + getAge());
        System.out.println("Managed employees:");
        for (Employee employee : employees) {
            System.out.println("Employee name : " + employee.getName() + " age : " + employee.getAge());
        }
    }
}
