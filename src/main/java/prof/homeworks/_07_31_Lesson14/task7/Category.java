package prof.homeworks._07_31_Lesson14.task7;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private static int counter = 0;
    private int id;
    private String title;
    private double priceAvg;
    private List<Product> products = new ArrayList<>();

    public Category(String title) {
        this.id = ++counter;
        this.title = title;
        this.priceAvg = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPriceAvg() {
        return priceAvg;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
        recountAVG();
    }

    private void recountAVG() {
        this.priceAvg = products.stream()
                .mapToDouble(p -> p.getPrice())
                .average()
                .orElse(0);
        this.priceAvg = Math.round(this.priceAvg * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", priceAvg=" + priceAvg +
                '}';
    }
}
