package basic._05_19_Lesson9.product;

public class Product {
    private String productTitle;
    private Category category;
    private int price;
    private int quntity;

    public Product(String productTitle, Category category, int price, int quntity) {
        this.productTitle = productTitle;
        this.category = category;
        this.price = price;
        this.quntity = quntity;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getQuntity() {
        return quntity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productTitle : " + productTitle +
                ", category : " + category +
                ", price : " + price +
                ", quntity : " + quntity +
                '}';
    }
}
