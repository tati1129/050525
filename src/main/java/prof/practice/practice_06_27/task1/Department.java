package prof.practice.practice_06_27.task1;

import java.util.Objects;

public class Department {
    private String departmentTitle;

    public Department(String departmentTitle) {
        this.departmentTitle = departmentTitle;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentTitle, that.departmentTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(departmentTitle);
    }

    @Override
    public String toString() {
        return departmentTitle;
    }
}
