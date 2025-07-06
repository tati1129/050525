package basic._06_02.Lesson16.bycicleRent;

public class RentDemo {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(1, "b1", "cityType", 300, true);
        Bicycle bicycle2 = new Bicycle(2, "b3", "MountainType", 300, true);
        Bicycle bicycle3 = new Bicycle(3, "s1", "cityType", 300, true);
        Bicycle bicycle4 = new Bicycle(4, "g51", "MountainType", 300, true);
        Bicycle bicycle5 = new Bicycle(5, "r41", "cityType", 300, true);

        Bicycle[] bicycles = {bicycle1, bicycle2, bicycle3, bicycle4, bicycle5};

        System.out.println("Список доступных велосипедов");
        for (int i = 0; i < bicycles.length; i++) {
            System.out.println("Велосипед");
            System.out.println("Номер " + bicycles[i].getId());
            System.out.println("Модель " + bicycles[i].getModel());
            System.out.println("Тип " + bicycles[i].getType());
            System.out.println("Цена " + bicycles[i].getPrice());
            System.out.println("Доступность " + bicycles[i].isAvialyble());
        }

        int cityBikeCounter = 0;
        String type = "cityType";

        for (int i = 0; i < bicycles.length; i++) {
            if (bicycle1.getType().equals(type)) {
                cityBikeCounter++;

            }
        }
    }
}
