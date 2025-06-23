package prof.lessons._06_23_Lesson3.enumExample;

public class Scholar {
    private boolean goToSchool;

    private  SchoolShcedule shcedule;

    public Scholar(SchoolShcedule shcedule) {
        this.shcedule = shcedule;
    }

    public void wakeUp(){
        if (shcedule.getDay() == DayOfWeek.SUNDAY) {
            System.out.println("Выходной!");
        }else {
            System.out.println("Wake up!");
        }
    }
}
