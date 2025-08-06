package prof.lessons._07_08_Lesson9.differentAcessKey;

public class Book {
    private String keyISBN;
    private String title;

    public Book(String keyISBN, String title) {
        this.keyISBN = keyISBN;
        this.title = title;
    }

    public String getKeyISBN() {
        return keyISBN;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "keyISBN='" + keyISBN + '\'' +
                ", title='" + title + '\'' +
                '}';
    }


}
