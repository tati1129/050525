package basic._06_11_Lesson21.junitObject;


public class BookRepository {

    private Book[] library;
    private int currentQantity = 0;

    public BookRepository(int librarySize) {
        this.library = new Book[librarySize];
    }

    public int getCurrentQantity() {
        return currentQantity;
    }

    public boolean save(Book book) {
        if (currentQantity < library.length) {
            library[currentQantity] = book;
            currentQantity++;
            return true;
        } else {
            return false;
        }
    }

    public Book findByBookId(String boolSearch) {

        for (int i = 0; i < currentQantity; i++) {
            if (library[i].getId().equals(boolSearch)) {
                return library[i];
            }
        }
        return null;
    }

    public Book findByBookTitle(String boolSearch) {

        for (int i = 0; i < currentQantity; i++) {
            if (library[i].getTitle().equals(boolSearch)) {
                return library[i];
            }
        }
        return null;
    }

    public Book[] findByBookAuthor(String bookSearch) {
        int countMatches = 0;
        Book[] booksAuthor;

        for (int i = 0; i < currentQantity; i++) {
            if (library[i].getAuthor().equals(bookSearch)) {
                countMatches++;
            }
        }

        booksAuthor = new Book[countMatches];
        int bookByAuthorIndex = 0;

        for (int i = 0; i < currentQantity; i++) {
            if (library[i].getAuthor().equals(bookSearch)) {
                booksAuthor[bookByAuthorIndex++] = library[i];
            }
        }

        return null;
    }

}
