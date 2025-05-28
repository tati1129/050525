package homeWorks._05_15_Lesson10.light.var1;

public class LightDemo {
    public static void main(String[] args) {
        Light light = new Light("Berlin", 90, "y");
        LightService service = new LightService();

        System.out.println("1__________-");
        System.out.println(light);

        service.changeMode(light);
        System.out.println("2__________-");
        System.out.println(light);

        System.out.println("3__________-");
        service.changeBrightness(light);

        System.out.println("4__________-");
        System.out.println(light);


        service.closeScanner();
    }
}
