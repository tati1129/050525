package prof.homeworks._06_18_Lesson1.inheritance.task1;

public class Vichicle {
    public String brand;
    public String model;
    public String year;
    public int speed;

    public Vichicle(String brand, String model, String year, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vichicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", year='" + year + '\'' +
                '}';
    }

    public void drive() {
        System.out.println("The vechicle is driving");
    }

    public void speedAVG() {
        System.out.println("The avg speed is :");
    }

    ;
}
