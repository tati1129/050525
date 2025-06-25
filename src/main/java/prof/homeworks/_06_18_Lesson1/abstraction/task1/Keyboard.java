package prof.homeworks._06_18_Lesson1.abstraction.task1;

public class Keyboard extends InputDevice {

    private Layout layout;


    public Keyboard(String model, String brand, Layout layout) {
        super(model, brand);
        this.layout = layout;
    }

    public Keyboard(Layout layout) {
        super("Unknown Model", "Unknown Brand");
        this.layout = layout;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public static void printAvailableLayouts() {
        System.out.print("Доступные раскладки: ");
        for (Layout l : Layout.values()) {
            System.out.print(l + " ");
        }
        System.out.println();
    }


    @Override
    public void connect() {
        System.out.println("Устройство " + getModel() + " " + getBrand() + " подключено!");
    }

    @Override
    public void disconnect() {

    }
}
