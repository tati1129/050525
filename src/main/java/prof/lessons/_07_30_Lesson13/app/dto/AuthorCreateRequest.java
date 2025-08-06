package prof.lessons._07_30_Lesson13.app.dto;

public class AuthorCreateRequest {
    private  int id;
    private String authorName;
    private String info;

    public AuthorCreateRequest(int id, String authorName, String info) {
        this.id = id;
        this.authorName = authorName;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getInfo() {
        return info;
    }
}
