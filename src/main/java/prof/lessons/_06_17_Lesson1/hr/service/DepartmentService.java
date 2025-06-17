package prof.lessons._06_17_Lesson1.hr.service;

import prof.lessons._06_17_Lesson1.hr.entity.Department;
import prof.lessons._06_17_Lesson1.hr.repositorii.DepartmentRepository;

public class DepartmentService {
   private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public  void createDepartments(){
        departmentRepository.save(new Department("Managment",2));
        departmentRepository.save(new Department("IT",1));
        departmentRepository.save(new Department("Accounting",1));
        departmentRepository.save(new Department("Marketing",2));
    }
    
    public Department findByName(String depName){
       return departmentRepository.findByName(depName);
    }

    public void printAll(){
       Department[] departments = departmentRepository.fidAll();
        for (Department department : departments) {
            System.out.println(department);
        }
    }

}
