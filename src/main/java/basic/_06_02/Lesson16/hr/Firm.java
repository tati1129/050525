package basic._06_02.Lesson16.hr;

import java.util.Arrays;

public class Firm {
    private String companyName;
    private String directorName;
    Department[] departments;

    public Firm(String companyName, Employee directorName, Department[] departments) {
        this.companyName = companyName;
        this.directorName = String.valueOf(directorName);
        this.departments = departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public Department[] getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "companyName='" + companyName + '\'' +
                ", directorName='" + directorName + '\'' +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}
