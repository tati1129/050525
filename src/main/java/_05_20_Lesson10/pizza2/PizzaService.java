package _05_20_Lesson10.pizza2;

public class PizzaService {


    public void calculateKalories(Pizza pizza1, Pizza pizza2){

        double quantity1 = Math.round((Math.PI * pizza1.getDiametr() *pizza1.getDiametr()) / 4 * pizza1.getCaloriesInSm() *100.0) / 100.0;
        double quantity2 = Math.round((Math.PI * pizza2.getDiametr() *pizza2.getDiametr()) / 4 * pizza2.getCaloriesInSm() *100.0) / 100.0;

        int result = (int) Math.abs(quantity1-quantity2);
        System.out.println("Разница в калориях : " + result);

    }

}
