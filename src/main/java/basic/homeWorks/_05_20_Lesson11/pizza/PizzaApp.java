package basic.homeWorks._05_20_Lesson11.pizza;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaService service = new PizzaService();

        service.calculateKalories(new Pizza(24,40), new Pizza(28,40));
    }
}
