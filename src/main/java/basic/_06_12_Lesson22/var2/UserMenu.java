package basic._06_12_Lesson22.var2;


import java.util.Scanner;

public class UserMenu {

    private CarService service;


    public UserMenu(CarService service) {
        this.service = service;
        // предварительное заполнение
        service.fillSampleCars();
    }


    /**
     * Основной цикл меню.
     */
    public void start() {
        while (true) {
            System.out.println("=== Меню каталога автомобилей ===");
            System.out.println("1. Добавить новый автомобиль");
            System.out.println("2. Поиск по номеру");
            System.out.println("3. Поиск по марке");
            System.out.println("4. Поиск по ценовому диапазону");
            System.out.println("5. Показать все автомобили");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");

            String choice = UserInputStatic.inputText("Выберите опцию:");
            switch (choice) {
                case "1":
                    addCarInteractive();
                    break;
                case "2":
                    findByNumberInteractive();
                    break;
                case "3":
                    findByBrandInteractive();
                    break;
                case "4":
                    findByPriceRangeInteractive();
                    break;
                case "5":
                    showAllCars();
                    break;
                case "0":
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
            }
        }
    }

    private void addCarInteractive() {
        String number = UserInputStatic.inputText("Введите номер в каталоге : ");
        String brand = UserInputStatic.inputText("Введите марку: ");
        double price = UserInputStatic.inputDouble("Введите цену");

        String addResultMessage = service.addCar(number, brand, price);
        System.out.println(addResultMessage);
    }

    private void findByNumberInteractive() {
        String number = UserInputStatic.inputText("Введите искомый номер: ");
        Car car = service.findByCatalogNumber(number);
        System.out.println(car != null ? car : "Автомобиль с таким номером в каталоге не найден.");
    }

    private void findByBrandInteractive() {
        String brand = UserInputStatic.inputText("Введите марку: ");
        Car[] carByBrands = service.findByBrand(brand);
        if (carByBrands.length == 0) {
            System.out.println("Автомобили данной марки не найдены.");
        } else {
            System.out.println("Найдено автомобилей: " + carByBrands.length);
            for (Car car : carByBrands) {
                System.out.println("  " + car);
            }
        }
    }

    private void findByPriceRangeInteractive() {
        System.out.print("Минимальная цена: ");
        double min = UserInputStatic.inputDouble("Введите минимальную цену для поиска:");
        double max = UserInputStatic.inputDouble("Введите максимальную цену для поиска:");

        Car[] carByPrice = service.findByPriceRange(min, max);
        if (carByPrice.length == 0) {
            System.out.println("Автомобили в этом диапазоне не найдены.");
        } else {
            System.out.println("Найдено автомобилей: " + carByPrice.length);
            for (Car car : carByPrice) {
                System.out.println("  " + car);
            }
        }
    }

    private void showAllCars() {
        Car[] allCars = service.getAllCars();
        System.out.println("Всего в каталоге: " + allCars.length);


        /*Пройдись по всему массиву и для каждого элемента из массива
        возьми его и сохрани во временную переменную

        ВСЕ ДАЛЬНЕЙШИЕ ДЕЙСТВИЯ БУДУТ ОСУЩЕСТВЛЯТЬ ТОЛЬКО С ЭТОЙ ВРЕМЕННОЙ ПЕРЕМЕННОЙ

         */
        for (Car tempCar : allCars) {
            System.out.println("  " + tempCar);
        }
    }
}
