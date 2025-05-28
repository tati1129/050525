package _05_26_Lesson13.practics.task3;

import javaPro3._05_26.UserInputStatic;

import java.util.Arrays;

public class CarDemo {

    public static void main(String[] args) {

        /*
        Создайте класс Car:
            private String producer;
            private String model;
            private int power;

        Для каталога автомобилей запросите у пользователя данные и создайте необходимое
        количество экземпляров этого класса и напечатайте данные для каталога.

            Например:
            public void printCarInfo(){
            System.out.println("Car{"+
            "producer = " + producer +
            ", model = " + model +
            ", power =" + power +
            "}"
            );
            }
         */
        CarUtil util = new CarUtil();

        int carCounter = UserInputStatic.inputInt("Введите количество машин :");

        Car[] cars = new Car[carCounter];

        for (int i = 0; i < carCounter; i++) {
            Car car = util.createCar();
            cars[i] = car;
            //System.out.println(car);
        }

        System.out.println(Arrays.toString(cars));
    }
}
