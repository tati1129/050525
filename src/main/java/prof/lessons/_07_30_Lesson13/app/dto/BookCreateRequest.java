package prof.lessons._07_30_Lesson13.app.dto;

public class BookCreateRequest {
    private String isbn;
    private String title;
    private String authorName;
    private String description;

    public BookCreateRequest(String isbn, String title, String authorName, String description) {
        this.isbn = isbn;
        this.title = title;
        this.authorName = authorName;
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getDescription() {
        return description;
    }
}
