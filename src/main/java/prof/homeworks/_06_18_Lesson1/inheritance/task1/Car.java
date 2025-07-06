package prof.homeworks._06_18_Lesson1.inheritance.task1;

public class Car extends Vichicle {
    private int doors;
    public int enginePower;

    public Car(String brand, String model, int speed, String year, int doors, int enginePower) {
        super(brand, model, year, speed);
        this.doors = doors;
        this.enginePower = enginePower;
    }

    public int getDoors() {
        return doors;
    }

    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public void drive() {
        System.out.println("The car is driving smoothly on the highway.");

    }

    @Override
    public void speedAVG() {
        System.out.println("Average speed of the " + brand + " model " + model + "  speed" + speed + " km/h");
    }
}
