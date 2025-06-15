package basic._06_12_Lesson22.var1.entity;

public class Car {
    private String catalogNumber;
    private String brand;
    private double price;

    public Car(String catalogNumber, String brand, double price) {
        this.catalogNumber = catalogNumber;
        this.brand = brand;
        this.price = price;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "catalogNumber='" + catalogNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
