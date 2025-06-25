package prof.homeworks._06_19_Lesson2.task1;

public class Dog implements Animal{

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String toString() {
        return "This is a Dog";
    }
}
