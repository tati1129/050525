package basic._06_16_Lesson23.ssed;

import java.util.Objects;

public class Product {
    private int id;
    private String category;
    private String title;
    private String brand;

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getBrand() {
        return brand;
    }

    public Product(int id, String category, String title, String brand) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(category, product.category) && Objects.equals(title, product.title) && Objects.equals(brand, product.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, title, brand);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
