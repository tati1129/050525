package prof.lessons._07_30_Lesson13.app.entity;

public class Author {
    private Integer id;
    private String authorName;
    private String info;

    public Author(Integer id, String authorName, String info) {
        this.id = id;
        this.authorName = authorName;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
