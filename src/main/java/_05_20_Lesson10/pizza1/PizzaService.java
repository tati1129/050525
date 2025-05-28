package _05_20_Lesson10.pizza1;

public class PizzaService {
    public double calculateKalories(double diameter, int calories ){

        double quantity =( Math.PI * diameter *diameter) / 4 * calories;
        double result = (Math.round(quantity)*100.0)/ 100.0;
        System.out.println("В пицце с диаметром " + diameter + " см " + result +" калорий");
        return result;
    }


}
