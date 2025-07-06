package basic.homeWorks._05_27_Lesson14.task2;

public class Greeter {
    private String name;
    private int times;

    public Greeter(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public Greeter() {
    }

    public void greet(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, " + name + "!");
        }
    }

    @Override
    public String toString() {
        return "Greeter{" +
                "name='" + name + '\'' +
                ", times=" + times +
                '}';
    }

}
