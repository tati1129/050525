package prof.homeworks._07_31_Lesson14.task9;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {
    private OrderRepository repository;
    private List<Order> orders;
    private final String path = "src/main/java/prof/homeworks/_07_31_Lesson14/task9/dataOrders.csv";

    public Service() {
        this.repository = new OrderRepository();
        repository.loadFromFile(path);
        this.orders = repository.findAll();
    }




    public Map<String, Integer> groupByMonths() {
        return orders.stream()
                .collect(Collectors.groupingBy(
                        o -> o.getDate().substring(5, 7),
                        Collectors.summingInt(o -> o.getPrice())));

    }

}
