package prof.homeworks._06_18_Lesson1.abstraction.task3;

public class MarineNavigationSystem extends NavigationSystem {
    private String vercion;

    public MarineNavigationSystem(String enviroment, String vercion) {
        super(enviroment);
        this.vercion = vercion;
    }

    @Override
    public void startNavigation() {
        System.out.println("Navigation on " + getEnviroment() + " is on!");
        System.out.println("Please check your anchor!");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Navigation on " + getEnviroment() + " is off!");

    }
}
