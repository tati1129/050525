package prof.homeworks._07_31_Lesson14.task9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    List<Order> orders = new ArrayList<>();

    public void loadFromFile(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String date = parts[1];
                int price = Integer.parseInt(parts[2]);
                boolean status = Boolean.parseBoolean(parts[3]);
                orders.add(new Order(id, date, price, status));
//                System.out.println("Order is added!");
            }
        }
            catch (IOException e) {
                System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
    public List<Order> findAll(){
        return new ArrayList<>(orders);
    }

}
