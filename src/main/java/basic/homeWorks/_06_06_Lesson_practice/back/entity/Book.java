package basic.homeWorks._06_06_Lesson_practice.back.entity;

public class Book {
    private static int nextBookId = 1;
private int id;
private String title;
private String author;

    public Book( String title, String author) {
        this.id = nextBookId++;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Book { " +
                "id : " + id +","+
                " title : '" + title +","+ '\'' +
                " author='" + author + '\'' +
                " }";
    }
}
