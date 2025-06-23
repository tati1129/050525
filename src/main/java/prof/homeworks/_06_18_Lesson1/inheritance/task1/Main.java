package prof.homeworks._06_18_Lesson1.inheritance.task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", " A6", 120,"2023", 5, 245);
        Car car2 = new Car("BMW", "  5 Series", 130,"2022", 5, 190);
        Car car3 = new Car("Mercedes", "E-Class", 125,"2021", 5, 210);

        Bicycle bicycle1 = new Bicycle("Santacruz", "Nomad", "2023",20, "mountain", "M");
        Bicycle bicycle2 = new Bicycle("Giant", "Defy", "2022",22, "road", "M");
        Bicycle bicycle3 = new Bicycle("Trek", "FX 3", "2021",30, "hybrid", "S");

        Vichicle[] vichicles = {car1,car2,car3, bicycle1,bicycle2,bicycle3};

        for (Vichicle vichicle : vichicles){
            vichicle.drive();
            vichicle.speedAVG();
        }
    }
}
