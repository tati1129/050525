package prof.lessons._07_09_Lesson10.responseRequestModel2.entity;

public class Product {
    private Integer id;
    private String productName;
    private Double price;
    private String description;

    public Product(Integer id, String productName, Double price, String description) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
