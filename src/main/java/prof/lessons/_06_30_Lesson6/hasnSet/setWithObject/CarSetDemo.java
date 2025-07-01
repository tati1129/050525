package prof.lessons._06_30_Lesson6.hasnSet.setWithObject;

import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        cars.add(new Car(1,"Mercedes","G500"));
        cars.add(new Car(2,"BMW","i8"));
        cars.add(new Car(3,"Audi","S8"));
        cars.add(new Car(4,"Mercedes","G500"));
        cars.add(new Car(1,"Mercedes","G500"));

        for (Car car : cars){
            System.out.println(car);
        }
    }
}
