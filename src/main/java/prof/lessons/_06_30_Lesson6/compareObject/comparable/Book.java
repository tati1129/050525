package prof.lessons._06_30_Lesson6.compareObject.comparable;

public class Book implements Comparable<Book> {
    private int id;
    private String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        int res = id - o.getId();
        if (res == 0) {
            res = title.compareTo(o.getTitle());
        }

        return res;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
