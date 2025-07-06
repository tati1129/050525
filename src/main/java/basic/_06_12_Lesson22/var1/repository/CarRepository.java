package basic._06_12_Lesson22.var1.repository;

import basic._06_12_Lesson22.var1.entity.Car;

public class CarRepository {
    private Car[] catalog;

    private int size;

    public CarRepository(int catalogCapacity) {
        this.catalog = new Car[catalogCapacity];
        this.size = 0;
    }

    public boolean addCar(Car car) {
        if (size >= catalog.length) {
            return false;
        }
        catalog[size++] = car;
        return true;
    }

    public Car findByCatalogNumber(String catalogNumber) {
        for (int i = 0; i < size; i++) {
            Car currentCarFromCatalog = catalog[i];
            if (currentCarFromCatalog.getCatalogNumber().equalsIgnoreCase(catalogNumber)) {
                return currentCarFromCatalog;
            }
        }
        return null;
    }

    public Car[] findCarByBrand(String catalogBrand) {
        int matchCounter = 0;
        for (int i = 0; i < size; i++) {
            Car currentCarFromCatalog = catalog[i];
            if (currentCarFromCatalog.getBrand().equalsIgnoreCase(catalogBrand)) {
                matchCounter++;
            }
        }

        Car[] carsByBrand = new Car[matchCounter];
        for (int i = 0; i < matchCounter; i++) {
            Car currentCarFromCatalog = catalog[i];
            if (currentCarFromCatalog.getBrand().equalsIgnoreCase(catalogBrand)) {
                carsByBrand[i++] = catalog[i];
            }
        }
        return null;
    }


    public Car[] findByPriceRange(double min, double max) {
        Car[] tempCars = new Car[size];
        int tempIndex = 0;

        for (int i = 0; i < size; i++) {
            Car currentCar = catalog[i];
            if (currentCar.getPrice() >= min && currentCar.getPrice() <= max) {
                tempCars[tempIndex++] = currentCar;
            }
        }

        Car[] carsByPriceRange = new Car[tempIndex];
        for (int i = 0; i < tempIndex; i++) {
            carsByPriceRange[i] = tempCars[i];
        }
        return carsByPriceRange;
    }

    public Car[] findAll() {
        Car[] existingCars = new Car[size];

        for (int i = 0; i < size; i++) {
            existingCars[i] = catalog[i];
        }

        return existingCars;
    }


}
