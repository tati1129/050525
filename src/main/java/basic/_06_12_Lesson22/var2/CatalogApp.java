package basic._06_12_Lesson22.var2;

public class CatalogApp {
    public static void main(String[] args) {

        int capacity = 10;
        CarRepository carRepository = new CarRepository(capacity);
        CarService carService = new CarService(carRepository);
        UserMenu userMenu = new UserMenu(carService);

        userMenu.start();

    }
}
