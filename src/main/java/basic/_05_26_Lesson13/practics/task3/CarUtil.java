package basic._05_26_Lesson13.practics.task3;

import javaPro3._05_26.UserInputStatic;

public class CarUtil {
    public Car createCar() {
        String producer = UserInputStatic.inputString("Введите производителя : ");
        String model = UserInputStatic.inputString("Введите модель");
        int power = UserInputStatic.inputInt("Введите мощность");
        Car car = new Car(producer, model, power);
        return car;
    }
}
