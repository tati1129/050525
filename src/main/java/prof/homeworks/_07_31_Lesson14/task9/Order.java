package prof.homeworks._07_31_Lesson14.task9;

public class Order {
    private int id;
    private String date;
    private int price;
    private boolean isActive;

    public Order(int id, String date, int price, boolean isActive) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", status=" + isActive +
                '}';
    }
}
