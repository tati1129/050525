package basic.homeWorks._06_06_Lesson_practice.back.service;

import basic.homeWorks._06_06_Lesson_practice.back.entity.Book;
import basic.homeWorks._06_06_Lesson_practice.back.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book registerBook(String title, String author) {
        Book book = new Book(title, author);
        boolean isSaved = bookRepository.saveBook(book);

        if (isSaved) {
            return book;
        } else {
            return null;
        }

    }

    public Book findById(int id) {
        return bookRepository.findBookByID(id);
    }

    public Book findByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    public Book[] getAllBooks() {
        return bookRepository.getBooks();
    }
}
