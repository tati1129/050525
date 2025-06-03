package basic._06_02.Lesson16.bycicleRent;

public class Bicycle {
    private int id;
    private String model;
    private String type;
    private int price;
    private boolean isAvialyble;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvialyble() {
        return isAvialyble;
    }

    public void setAvialyble(boolean avialyble) {
        isAvialyble = avialyble;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Bicycle(int id, String model, String type, int price, boolean isAvialyble) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.price = price;
        this.isAvialyble = isAvialyble;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isAvialyble=" + isAvialyble +
                '}';
    }
}
