package prof.lessons._06_19_Lesson2.interfaces.practice.entity.general;

abstract public class Vechicle {
    private String model;
    private Integer speed;

    public Vechicle(String model, Integer speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    abstract  void accelerate();
    abstract  void brake();
}
