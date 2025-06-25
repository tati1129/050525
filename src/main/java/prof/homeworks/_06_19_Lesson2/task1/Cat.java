package prof.homeworks._06_19_Lesson2.task1;

public class Cat implements Animal{
    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String toString() {
        return "This is a Cat!";
    }
}
