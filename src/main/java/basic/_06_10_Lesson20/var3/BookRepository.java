package basic._06_10_Lesson20.var3;

public class BookRepository {
    private Book[] library;
    private int currentQantuty = 0;

    public BookRepository() {
        this.library = new Book[BookConfiguration.MAX_QUANTITY];
    }

    public Book[] getLibrary() {
        return library.clone();
    }

    public boolean save(Book book) {
        if (currentQantuty < library.length) {
            library[currentQantuty] = book;
            currentQantuty++;
            return true;
        } else {
            return false;
        }
    }

    public Book findByBookId(String boolSearch) {

        for (int i = 0; i < currentQantuty; i++) {
            if (library[i].getBookId().equals(boolSearch)) {
                return library[i];
            }
        }
        return null;
    }

    public Book findByBookTitle(String boolSearch) {

        for (int i = 0; i < currentQantuty; i++) {
            if (library[i].getTitle().equals(boolSearch)) {
                return library[i];
            }
        }
        return null;
    }

    public Book[] findByBookAuthor(String bookSearch) {
        int countMatches = 0;
        Book[] booksAuthor;

        for (int i = 0; i < currentQantuty; i++) {
            if (library[i].getAuthor().equals(bookSearch)) {
                countMatches++;
            }
        }

        booksAuthor = new Book[countMatches];
        int bookByAuthorIndex = 0;

        for (int i = 0; i < currentQantuty; i++) {
            if (library[i].getAuthor().equals(bookSearch)) {
                booksAuthor[bookByAuthorIndex++] = library[i];
            }
        }

        return null;
    }

}
