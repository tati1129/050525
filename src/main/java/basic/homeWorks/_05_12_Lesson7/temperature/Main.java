package basic.homeWorks._05_12_Lesson7.temperature;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________________________");
        System.out.println("temperature 1  " );
        Temperature temperature1 = new Temperature();
        temperature1.tempCelcii = 20;
        temperature1.toFahrenheit();


        System.out.println("__________________________");
        System.out.println("temperature 2  " );
        Temperature temperature2 = new Temperature();
        temperature2.tempCelcii = 30;
        temperature2.toFahrenheit();
    }
}
