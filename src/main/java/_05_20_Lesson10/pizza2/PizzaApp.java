package _05_20_Lesson10.pizza2;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaService service = new PizzaService();

        service.calculateKalories(new Pizza(24,40), new Pizza(28,40));
    }
}
