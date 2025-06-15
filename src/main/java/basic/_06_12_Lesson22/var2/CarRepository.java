package basic._06_12_Lesson22.var2;

public class CarRepository {

    private Car[] catalog;
    private int size;

    public CarRepository(int catalogCapasity) {
        this.catalog = new Car[catalogCapasity];
        this.size = 0;
    }

    public boolean add(Car car) {
        if (size >= catalog.length) {
            return false;
        }
        // мы сперва в ячейку массива catalog с индексом size
        // положили ссылку на car
        // а ЗАТЕМ увеличили значение в size на 1
        catalog[size++] = car;
        return true;
    }


    public Car findCarByIdCar(String catalogNumber) {
        for (int i = 0; i < size; i++) {
            Car currentCarFromCatalog = catalog[i];
            if (currentCarFromCatalog.getCatalogNumber().equalsIgnoreCase(catalogNumber)) {
                return currentCarFromCatalog;
            }
        }
        return null;
    }

    public Car[] findCarByBrand(String brandForSearch) {
        int carByBrandCounter = 0;
        for (int i = 0; i < size; i++) {
            Car currentCarFromCatalog = catalog[i];
            if (currentCarFromCatalog.getBrand().equalsIgnoreCase(brandForSearch)) {
                carByBrandCounter++;
            }
        }

        Car[] carsByBrand = new Car[carByBrandCounter];
        int index = 0;
         /*
            проходимся по всем автомобилям из каталога
            проверяем, что марка очередного автомобиля
            совпадает или нет с маркой, которую мы ищем
            если совпадает - то ссылку на этот объект
            сохраняем в очередной ячейки "выходного" массива
            и увеличиваем его индекс на 1 чтобы в следующий
            раз работать уже со следующей его ячейкой
             */
        for (int i = 0; i < size; i++) {
            Car currentCarFromCatalog = catalog[i];
            if (currentCarFromCatalog.getBrand().equalsIgnoreCase(brandForSearch)) {
                carsByBrand[index++] = catalog[i];
            }
        }
        return null;
    }

    public Car[] findByPriceRange(double minPrice, double maxPrice) {
        Car[] temp = new Car[size];
        int tempIndex = 0;

        for (int i = 0; i < size; i++) {
            Car currentCar = catalog[i];
            if (currentCar.getPrice() >= minPrice && currentCar.getPrice() <= maxPrice) {
                temp[tempIndex] = currentCar;
            }
        }
        Car[] carsByPriceRange = new Car[tempIndex];
        for (int i = 0; i < tempIndex; i++) {
            carsByPriceRange[i] = temp[i];

        }
        return carsByPriceRange;
    }

    public Car[] findall() {
        Car[] existingCars = new Car[size];

        for (int i = 0; i < size; i++) {
            existingCars[i] = catalog[i];
        }
        return existingCars;
    }
}
