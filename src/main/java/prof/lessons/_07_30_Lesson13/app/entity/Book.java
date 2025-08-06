package prof.lessons._07_30_Lesson13.app.entity;

public class Book {

    private String isbn;
    private String title;
    private Author author;
    private String description;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", description='" + description + '\'' +
                '}';
    }
}
