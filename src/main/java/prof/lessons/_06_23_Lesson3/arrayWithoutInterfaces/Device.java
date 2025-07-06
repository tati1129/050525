package prof.lessons._06_23_Lesson3.arrayWithoutInterfaces;

abstract public class Device {
    private String model;
    private String description;

    public Device(String model, String description) {
        this.model = model;
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    abstract void switchOn();

    abstract void switchOff();
}
