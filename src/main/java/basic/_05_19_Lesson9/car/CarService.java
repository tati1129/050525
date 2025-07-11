package basic._05_19_Lesson9.car;

import basic._05_19_Lesson9.UserInput;

public class CarService {

    public CarProducer createCarProducer() {
        UserInput input = new UserInput();

        String title = input.inputText("Введите название производителя : ");
        String country = input.inputText("Введите страну производителя : ");

        CarProducer carProducer = new CarProducer(title, country);
        return carProducer;
    }

    public Car createCar(CarProducer carProducer) {
        UserInput input = new UserInput();

        String model = input.inputText("Введите название модели машины : ");
        String color = input.inputText("Введите цвет машины : ");

        Car car = new Car(model, carProducer, color);
        return car;
    }
}
