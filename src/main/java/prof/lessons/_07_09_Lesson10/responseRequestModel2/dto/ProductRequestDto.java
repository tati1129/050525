package prof.lessons._07_09_Lesson10.responseRequestModel2.dto;

public class ProductRequestDto {
//    private Integer id;
    private String productName;
    private Double price;
    private String description;

    public ProductRequestDto(String productName, Double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
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
        return "ProductRequestDto{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
