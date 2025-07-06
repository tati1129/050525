package prof.lessons._06_19_Lesson2.interfaces.practice.entity.general;

public class MotorizeVechicle extends Vechicle {
    private Engine engine;
    private GearShift gearShift;

    public MotorizeVechicle(String model, Integer speed) {
        super(model, speed);
    }

    @Override
    void brake() {
        if (getSpeed() > 10) {
            setSpeed(getSpeed() - 10);
        }

    }

    @Override
    void accelerate() {
        setSpeed(getSpeed() + 10);
        setSpeed(getSpeed());
    }
}
