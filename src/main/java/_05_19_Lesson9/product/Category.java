package _05_19_Lesson9.product;

public class Category {
    private String title;
    private String info;

    public Category(String title, String info) {
        this.title = title;
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Category{" +
                "title : " + title +
                ", info : " + info +
                '}';
    }
}
