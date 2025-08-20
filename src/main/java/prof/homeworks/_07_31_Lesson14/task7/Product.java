package prof.homeworks._07_31_Lesson14.task7;

public class Product {
    private static int counter = 0;
    private int id;
    private String title;
    private Category category;
    private double price;
    private int quantity;


    public Product(String title, Category category, double price, int quantity) {
        this.id = ++counter;
        this.title = title;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
