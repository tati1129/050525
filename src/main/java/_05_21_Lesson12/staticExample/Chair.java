package _05_21_Lesson12.staticExample;

public class Chair {
    static int chairCounter = 0;

    int id;
    String model;
    public Chair(int id, String model){
        this.id = id;
        this.model = model;
        chairCounter++;
    }

}
