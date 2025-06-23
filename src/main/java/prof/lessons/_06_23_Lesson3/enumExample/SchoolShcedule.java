package prof.lessons._06_23_Lesson3.enumExample;

public class SchoolShcedule {
    private  DayOfWeek day;
    private  String name;

    public SchoolShcedule(DayOfWeek day, String name) {
        this.day = day;
        this.name = name;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public String getName() {
        return name;
    }
}
