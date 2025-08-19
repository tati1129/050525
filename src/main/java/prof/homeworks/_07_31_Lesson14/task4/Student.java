package prof.homeworks._07_31_Lesson14.task4;

public class Student {
    private String name;
    private int age;
    private int year;
    private double avgGrade;

    public Student(String name, int age, int year, double avgGrade) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
