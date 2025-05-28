package basic.homeWorks._05_13_Lesson8.temperaturs;

public class Temperature {
    double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double convertToFahrenheit(){
        return  (celsius * 9 / 5) + 32;

    }

}
