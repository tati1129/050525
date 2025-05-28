package homeWorks._05_26_Lesson13.task1;

import homeWorks._05_26_Lesson13.UserInput;

public class CarUtil {
    public Car createCar() {
        String producer = UserInput.inputText("Введите производителя : ");
        String model = UserInput.inputText("Введите модель");
        int power = UserInput.inputInt("Введите мощность");
        Car car = new Car(producer, model, power);
        return car;
    }
}
