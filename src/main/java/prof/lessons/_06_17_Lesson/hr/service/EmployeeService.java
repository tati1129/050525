package prof.lessons._06_17_Lesson.hr.service;

import prof.lessons._06_17_Lesson.hr.UserInputStatic;
import prof.lessons._06_17_Lesson.hr.entity.Department;
import prof.lessons._06_17_Lesson.hr.entity.Employee;
import prof.lessons._06_17_Lesson.hr.entity.Person;
import prof.lessons._06_17_Lesson.hr.repositorii.EmployeeRepository;

public class EmployeeService {
    private EmployeeRepository repository;
    private ApplicantService aplicantService;

    public EmployeeService(EmployeeRepository repository, ApplicantService aplicantService) {
        this.repository = repository;
        this.aplicantService = aplicantService;
    }

    public void addNewEmployee() {
        // Получает ID соискателя с клавиатуры.
        int aplicantId = UserInputStatic.inputInt("Введите id соискателя для оформления в компанию:");

        // Одобряет соискателя через applicantService.approveCandidate(applicantId);.
        aplicantService.approveCandidate(aplicantId);

        // Извлекает данные:
        //  - Person (личные данные соискателя),
        //  - Department (отдел, в который он идёт).
        Person person = aplicantService.personFromAplicant(aplicantId);
        Department department = aplicantService.departmentFromAplicant(aplicantId);

        //Запрашивает ввод нового ID сотрудника, должности и зарплаты.
        int newEmployeeId = UserInputStatic.inputInt("Введите номер нового сотрудника:");
        String newEmployeePosition = UserInputStatic.inputText("Введите должность нового сотрудника");
        int newEmployeeSalary = UserInputStatic.inputInt("Введите зарплату новго сотрудника:");

        // Создаёт объект Employee
        Employee employee = new Employee(newEmployeeId, person, department, newEmployeePosition, newEmployeeSalary);

        // Сохраняет сотрудника через repository.save(...).
        String savedMessage = repository.save(employee);

        // Выводит сообщение об успехе/ошибке сохранения.
        System.out.println(savedMessage);
    }

    public void printAll() {
        Employee[] all = repository.findAll();
        for (Employee employee : all) {
            System.out.println(employee);
        }
    }
}
