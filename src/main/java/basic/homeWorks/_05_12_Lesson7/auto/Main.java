package basic.homeWorks._05_12_Lesson7.auto;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________________________");
        System.out.println("Car 1 : ");

        Car car1 = new Car();
        car1.brand = "Mercedes";
        car1.model = "S 63AMG";
        car1.year = 2018;
        car1.mileage = 9970;
        System.out.println("brand : " + car1.brand);
        System.out.println("model : " + car1.model);
        System.out.println("year : " + car1.year);
        System.out.println("mileage : " + car1.mileage);



        System.out.println("__________________________");
        System.out.println("Car 2 : ");

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "BMW 5";
        car2.year = 2024;
        car2.mileage = 3800;

        System.out.println("brand : " + car2.brand);
        System.out.println("model : " + car2.model);
        System.out.println("year : " + car2.year);
        System.out.println("mileage : " + car2.mileage);
    }
}
