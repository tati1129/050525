package prof.lessons._06_17_Lesson.hr.repositorii;

import prof.lessons._06_17_Lesson.hr.entity.Department;

public class DepartmentRepository {
    private Department[] departments;
private int departmentCounter = 0;


    public DepartmentRepository(int num) {
        this.departments = new Department[num];
    }

    public String save(Department department){
        if (departmentCounter<departments.length){
            departments[departmentCounter++] = department;
            return "Новый департмент создан успешно";
        }
        return "Добавить департамент не удалось.";
    }

    public Department findByName(String name){
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getDepartmentName().equalsIgnoreCase(name)){
                return departments[i];
            }
        }
        return null;
    }
    public Department[] fidAll(){
        return departments;
    }
}
