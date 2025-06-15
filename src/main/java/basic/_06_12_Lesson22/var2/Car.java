package basic._06_12_Lesson22.var2;

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
//        return "Car{" +
//                "idCar='" + idCar + '\'' +
//                ", model='" + model + '\'' +
//                ", price=" + price +
//                '}';
        return String.format("Car { Номер каталога: '%s', марка авто: '%s', цeна: '%.2f' }", catalogNumber, brand, price);
    }
}
