package basic._06_12_Lesson22.var2;

public class CarService {
    private  CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }
 /*
    список методов для сервиса:
    - добавить
    - найти по номеру каталога
    - найти по марке
    - найти про диапазону цен
    - найти все
     */

    public String addCar(String catalogNumber, String brand, double price){
        Car car = new Car(catalogNumber, brand, price);
        // можем проверить (validation) содержимое полученных данных
        // и если критерии проверки будут соблюдены - то идем дальше
        boolean addResult = repository.add(car);

        if (addResult){
            return "Done";
        }else {
            return "not done!";
        }
    }


    public  Car findByCatalogNumber(String catalogNumber){
        return repository.findCarByIdCar(catalogNumber);
    }
    public  Car[] findByBrand(String brand){
        return repository.findCarByBrand(brand);
    }

    public  Car[] findByPriceRange(double min, double max){
        // если пользователь ошибся при вводе диапазона цен,
        // то поменяем местами значения в переменных
        if (max < min){
            double temp = max;
            max = min;
            min = temp;
        }
        return repository.findByPriceRange(min, max);
    }

    public Car[] getAllCars(){
        return repository.findall();
    }

    //для текущей задачи создадим метод первоначального автоматического заполнения каталога
    public void fillSampleCars(){
        addCar("A1","Mercedes", 49000);
        addCar("B2","BMW", 65000);
        addCar("C3","Tesla", 44700);
        addCar("D4","Audi", 40000);
        addCar("E5","Toyota", 33000);
    }
}
