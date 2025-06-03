package basic._06_02.Lesson16.bycicleRent;

public class RentDemoWithService {
    public static void main(String[] args) {
        RentService service = new RentService();

        Bicycle[] bicycles = service.createArrBycycles();
service.shoAllBycycle(bicycles);
        String type = "cityType";


        int counter = service.countingBicycleByType(bicycles);
        service.printResult(counter,type);

    }
}
