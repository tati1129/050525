package prof.lessons._06_23_Lesson3.zoo.entity;

public class BirdFlyable extends Bird implements Flyable {
    public BirdFlyable(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void fly() {

    }
}
