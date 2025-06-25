package prof.homeworks._06_18_Lesson1.abstraction.task3;

public class Main {
    public static void main(String[] args) {
        MarineNavigationSystem marineNavigationSystem = new MarineNavigationSystem("Water", "v34");
        CarNavigationSystem carNavigationSystem = new CarNavigationSystem("Earth", "Rwq332");

        marineNavigationSystem.startNavigation();
        marineNavigationSystem.stopNavigation();

        carNavigationSystem.startNavigation();
        carNavigationSystem.stopNavigation();
    }
}
