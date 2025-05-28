package homeWorks._05_13_Lesson8.temperaturs;

public class TemperatureDemo {
    public static void main(String[] args) {
Temperature temperature1 = new Temperature(22);
Temperature temperature2 = new Temperature(32);

double result1 = temperature1.convertToFahrenheit();
double result2 = temperature2.convertToFahrenheit();

        System.out.println(temperature1.celsius + "C = "+ result1 + "F");
        System.out.println(temperature2.celsius + "C = "+ result2 + "F");
    }
}
