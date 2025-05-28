package basic._05_20_Lesson10.pizza1;

public class PizzaNew {
    public static void main(String[] args) {
        PizzaService service = new PizzaService();
        double countPizzaSmall = service.calculateKalories(24,40);
        double countPizzaBig = service.calculateKalories(28,40);

        System.out.println("Разница в калориях составляет : " + (countPizzaBig-countPizzaSmall));
    }
}
