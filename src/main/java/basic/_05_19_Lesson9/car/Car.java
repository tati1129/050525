package basic._05_19_Lesson9.car;

public class Car {
    private String model;
    CarProducer producer;
    private String color;

    public Car(String model, CarProducer producer, String color) {
        this.model = model;
        this.producer = producer;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public CarProducer getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model :" + model + '\'' +
                ", producer : " + producer +
                ", color : " + color + '\'' +
                '}';
    }
}
