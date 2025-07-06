package basic.homeWorks._05_12_Lesson7.temperature;

public class Temperature {
    int tempCelcii;
    ;

    public void toFahrenheit() {
        int tempFarenheit = (tempCelcii * 9 / 5) + 32;
        System.out.println("Temperature " + tempCelcii + "C = " + tempFarenheit + "F");
    }
}
