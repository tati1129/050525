package basic.homeWorks._06_06_Lesson_practice;

import basic.homeWorks._06_06_Lesson_practice.back.repository.BookRepository;
import basic.homeWorks._06_06_Lesson_practice.back.service.BookService;
import basic.homeWorks._06_06_Lesson_practice.front.UserMenu;

public class BookApp {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);

        UserMenu userMenu = new UserMenu(bookService);

        userMenu.start();
    }
}
