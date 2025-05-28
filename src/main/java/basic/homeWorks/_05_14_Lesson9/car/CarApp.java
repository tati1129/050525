package basic.homeWorks._05_14_Lesson9.car;

import homeworks._05_14.car.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Z4", 2.0, 52.0);

        System.out.println(car);

        car.setFuelConsumption(2.1);

        System.out.println(car);
    }
}
