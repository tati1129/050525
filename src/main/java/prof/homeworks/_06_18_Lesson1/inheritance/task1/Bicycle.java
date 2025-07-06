package prof.homeworks._06_18_Lesson1.inheritance.task1;

public class Bicycle extends Vichicle {
    private String type;
    private String size;


    public Bicycle(String brand, String model, String year, int speed, String type, String size) {
        super(brand, model, year, speed);
        this.type = type;
        this.size = size;

    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }


    @Override
    public void drive() {
        System.out.println("The bicycle is being pedaled along the cycling path.");
    }

    @Override
    public void speedAVG() {
        System.out.println("Average speed of the bicycle brand " + brand + "model " + model + "  speed " + speed + " km/h");
    }
}
