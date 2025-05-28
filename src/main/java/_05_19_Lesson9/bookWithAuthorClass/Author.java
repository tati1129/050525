package _05_19_Lesson9.bookWithAuthorClass;

public class Author {
    private String name;
    private String info;

    public Author(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
