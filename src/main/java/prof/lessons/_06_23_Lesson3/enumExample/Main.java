package prof.lessons._06_23_Lesson3.enumExample;

public class Main {
    public static void main(String[] args) {
        SchoolShcedule shcedule = new SchoolShcedule(DayOfWeek.MONDAY, "Peter");
        Scholar scholar = new Scholar(shcedule);

        scholar.wakeUp();
    }
}
