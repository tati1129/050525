package prof.homeworks._06_25_Lesson4.arrayList;

import java.util.Objects;

public class Phone {
    private String title;
    private Integer price;

    public Phone(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(title, phone.title) && Objects.equals(price, phone.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Phone { " +
                title + " : " +
                +price +
                " } ";
    }
}
