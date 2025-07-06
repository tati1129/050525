package prof.homeworks._06_18_Lesson1.abstraction.task3;

public class CarNavigationSystem extends NavigationSystem {

    private String name;

    public CarNavigationSystem(String enviroment, String name) {
        super(enviroment);
        this.name = name;
    }

    @Override
    public void startNavigation() {
        System.out.println("Navigation on " + getEnviroment() + " is on!");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Navigation on " + getEnviroment() + " is off!");
    }
}
