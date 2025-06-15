package basic._06_12_Lesson22.var1.front;

import basic._06_12_Lesson22.var1.service.CarService;

public class UserMenu {
    private CarService carService;

    public UserMenu(CarService carService) {
        this.carService = carService;
        carService.fillSampleCars();
    }
}
