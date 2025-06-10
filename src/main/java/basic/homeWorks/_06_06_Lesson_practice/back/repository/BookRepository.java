package basic.homeWorks._06_06_Lesson_practice.back.repository;

import basic.homeWorks._06_06_Lesson_practice.BookConfiguration;
import basic.homeWorks._06_06_Lesson_practice.back.entity.Book;

public class BookRepository {
    private Book[] books;
    private int bookCounter;

    public BookRepository() {
        this.books = new Book[BookConfiguration.MAX_QUANTITY];
        this.bookCounter = 0;
    }

    public Book[] getBooks() {
        return books.clone();
    }

    public boolean saveBook(Book book) {
        if (bookCounter < books.length) {
            books[bookCounter++] = book;
            return true;
        }
        return false;
    }

    public Book findBookByID(int idBook) {
        for (int i = 0; i < bookCounter; i++) {
            if (books[i] != null && books[i].getId() == idBook) {
                return books[idBook];
            }
        }
        return null;
    }

    public Book findBookByTitle(String bookTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(bookTitle)) {
                return books[i];
            }
        }
        return null;
    }
}
