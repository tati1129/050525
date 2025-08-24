package prof.homeworks._07_31_Lesson14.task10;

import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private List<String> tags;

    public Book(int id, String title, String author, List<String> tags) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + tags +
                '}';
    }
}
