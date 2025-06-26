package prof.lessons._06_23_Lesson3.arrayWithoutInterfaces;

public class Computer extends Device{

private int size;
private String processor;

    public Computer(String model, String description, int size, String processor) {
        super(model, description);
        this.size = size;
        this.processor = processor;
    }

    public int getSize() {
        return size;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    void switchOn() {

    }

    @Override
    void switchOff() {

    }
}
