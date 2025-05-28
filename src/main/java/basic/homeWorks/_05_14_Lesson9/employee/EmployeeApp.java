package basic.homeWorks._05_14_Lesson9.employee;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom",39, 21.8);

        System.out.println("Name : " + employee.getName() + " , "+ " worked hours : " + employee.getHoursWorked() + " , " + " rate : " +  employee.getHourlyRate() + " salary : " +  employee.getMonthlySalary());

        employee.setHoursWorked(41);

        System.out.println(employee);
    }
}
