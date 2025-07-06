package prof.homeworks._06_18_Lesson1.abstraction.task1;

abstract public class InputDevice {

    private String model;
    private String brand;

    public InputDevice(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void connect();

    public abstract void disconnect();

    @Override
    public String toString() {
        return "InputDevice{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
