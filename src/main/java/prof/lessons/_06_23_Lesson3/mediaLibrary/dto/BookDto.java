package prof.lessons._06_23_Lesson3.mediaLibrary.dto;

public class BookDto {
        /*
    DTO - Data Transfer Object
    Класс, предназначенный, исключительно для передачи данных
    между различными слоями приложения (от одного класса / метода
    другому)
     */

    private String title;
    private String author;
    private int year;
    private int pageCounter;

    public BookDto(String title, String author, int year, int pageCounter) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageCounter = pageCounter;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPageCounter() {
        return pageCounter;
    }
}
