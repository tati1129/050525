package prof.lessons._06_17_Lesson.hr;

import prof.lessons._06_17_Lesson.hr.repositorii.AplicantRepository;
import prof.lessons._06_17_Lesson.hr.repositorii.DepartmentRepository;
import prof.lessons._06_17_Lesson.hr.repositorii.EmployeeRepository;
import prof.lessons._06_17_Lesson.hr.service.ApplicantService;
import prof.lessons._06_17_Lesson.hr.service.DepartmentService;
import prof.lessons._06_17_Lesson.hr.service.EmployeeService;

public class Main {
    public static void main(String[] args) {

        AplicantRepository aplicantRepository = new AplicantRepository();
        DepartmentRepository departmentRepository = new DepartmentRepository(4);
        EmployeeRepository employeeRepository = new EmployeeRepository(5);

        DepartmentService departmentService =new DepartmentService(departmentRepository);
        ApplicantService applicantService = new ApplicantService(aplicantRepository,departmentService);
        EmployeeService employeeService = new EmployeeService(employeeRepository,applicantService);

        departmentService.createDepartments();

        departmentService.printAll();

        applicantService.addNewAplicant();

        System.out.println("После добавления первого соискателя: ");
        applicantService.printAll();

        applicantService.addNewAplicant();
        applicantService.addNewAplicant();
        applicantService.addNewAplicant();
        applicantService.addNewAplicant();

        System.out.println("После добавления всех соискателей: ");
        applicantService.printAll();

        employeeService.addNewEmployee();
        employeeService.addNewEmployee();

        System.out.println("После оформления на работу 3x соискателей: ");
        employeeService.printAll();
    }
}
