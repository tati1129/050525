package prof.homeworks._06_18_Lesson1.abstraction.task3;

abstract public class NavigationSystem {
    private String enviroment;

    public NavigationSystem(String enviroment) {
        this.enviroment = enviroment;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public abstract void startNavigation();
    public abstract void stopNavigation();
}
