package prof.lessons._06_17_Lesson1.hr.entity;

public class Person {
    private String name;
    private String speciality;

    public Person(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
