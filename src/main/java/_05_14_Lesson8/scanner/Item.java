package _05_14_Lesson8.scanner;

public class Item {
    String producer;
    String title;
    double price;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item(String producer, String title, double price) {
        this.producer = producer;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
