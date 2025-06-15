package basic._06_12_Lesson22.var1.service;

import basic._06_12_Lesson22.var1.entity.Car;
import basic._06_12_Lesson22.var1.repository.CarRepository;

public class CarService {
    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public String addCar(String catalogNumber, String brand, double price){
        Car car = new Car(catalogNumber,brand,price);
        boolean addResult = carRepository.addCar(car);
        if (addResult){
            return "Машина добавлена!";
        }
        return "Добавить в каталог не удалось!";
    }

    public Car findByCatalogNumber(String catalogNumber){
        return  carRepository.findByCatalogNumber(catalogNumber);
    }

    public Car[] findByBrand(String brand){
        return carRepository.findCarByBrand(brand);
    }

    public Car[] finByPriceRange(double min, double max){
        if (min>max){
            double temp = max;
            max = min;
            min = temp;
        }
        return carRepository.findByPriceRange(min,max);
    }
    public Car[] getAllCars(){
        return carRepository.findAll();
    }

    public void fillSampleCars(){
        addCar("A1","Mercedes", 1000);
        addCar("B2","BMW", 2000);
        addCar("C3","Tesla", 3000);
        addCar("D4","Audi", 4000);
        addCar("E5","Toyota", 5000);
    }
}
