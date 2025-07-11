package prof.lessons._06_17_Lesson.hr.entity;

public class Department {
    private String departmentName;
    private int quantityEmployee;

    public Department(String departmentName, int quantityEmployee) {
        this.departmentName = departmentName;
        this.quantityEmployee = quantityEmployee;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getQuantityEmployee() {
        return quantityEmployee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", quantityEmployee=" + quantityEmployee +
                '}';
    }
}
