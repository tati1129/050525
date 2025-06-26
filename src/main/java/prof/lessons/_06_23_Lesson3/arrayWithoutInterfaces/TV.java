package prof.lessons._06_23_Lesson3.arrayWithoutInterfaces;

public class TV extends Device{
    private int size;
    private String technology;

    public TV(String model, String description, int size, String technology) {
        super(model, description);
        this.size = size;
        this.technology = technology;
    }

    public int getSize() {
        return size;
    }

    public String getTechnology() {
        return technology;
    }

    @Override
    void switchOn() {

    }

    @Override
    void switchOff() {

    }
}
