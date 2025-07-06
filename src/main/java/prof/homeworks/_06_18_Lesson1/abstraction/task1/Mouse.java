package prof.homeworks._06_18_Lesson1.abstraction.task1;

public class Mouse extends InputDevice {
    private int dpi;
    private String color;

    public Mouse(String model, String brand, int dpi, String color) {
        super(model, brand);
        this.dpi = dpi;
        this.color = color;
    }

    @Override
    public void disconnect() {
        System.out.println("Устройство " + getModel() + " " + getBrand() + " подключено!");
    }

    @Override
    public void connect() {
        System.out.println("Устройство " + getModel() + " " + getBrand() + " подключено!");
    }
}
