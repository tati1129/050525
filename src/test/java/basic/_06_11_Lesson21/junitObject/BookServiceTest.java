package basic._06_11_Lesson21.junitObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    private int repSize = 3;
    private BookRepository bookRepository = new BookRepository(repSize);
    private BookService bookService = new BookService(bookRepository);

    @BeforeEach
    void setup() {
        Book testBook = new Book("1", "Suns", "Dfew");
        boolean saveResult = bookService.addNewBook(testBook);
    }

    @Test
    void testAddNewBook() {
        // что мы проверяем?
        // а) изменение количество сохраненных книг

        //assertTrue(saveResult);
        assertEquals(1, bookRepository.getCurrentQantity());
    }

    @Test
    void testFindBookByID() {
        Book testBook = new Book("1", "Suns", "Dfew");
        // что мы проверяем?
        // а) что книга с id таким-то есть в репозитории

        Book foundedBook = bookService.findBookByID("1");
        // не забываем в классе Book переопределить метод equal()
        assertEquals(testBook, foundedBook);
    }
}