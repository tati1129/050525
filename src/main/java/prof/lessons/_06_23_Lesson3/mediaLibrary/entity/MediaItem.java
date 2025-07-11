package prof.lessons._06_23_Lesson3.mediaLibrary.entity;

abstract public class MediaItem {
    private String title;
    private String author;
    private int year;

    public MediaItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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

    public abstract void printInfo();
}
