package basic.homeWorks._06_06_Lesson_practice.front;

import basic.homeWorks._06_06_Lesson_practice.UserInputStatic;
import basic.homeWorks._06_06_Lesson_practice.back.entity.Book;
import basic.homeWorks._06_06_Lesson_practice.back.service.BookService;

public class UserMenu {

    private BookService bookService;

    public UserMenu(BookService bookService) {
        this.bookService = bookService;
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            int choiseUser = UserInputStatic.inputInt(
                    " ___ МЕНЮ ___\n" +
                            " 1. Зарегистрировать книгу \n" +
                            " 2. Показать все книги \n" +
                            " 3. Поиск по ID \n" +
                            " 4. Поиск по названию \n" +
                            " 5. Выход \n" +
                            " Сделайте Ваш выбор: "
            );

            switch (choiseUser) {
                case 1 -> registerBooks();
                case 2 -> printAllBook();
                case 3 -> searchById();
                case 4 -> searchByTitle();
                case 5 -> {
                    System.out.println("До свидания!");
                    exit = true;
                }
                default -> System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }


    private void registerBooks() {
        int bookCounter = UserInputStatic.inputInt("Сколько книг хотите зарегистрировать?");

        for (int i = 0; i < bookCounter; i++) {
            String bookTitle = UserInputStatic.inputString("Введите название книги : ");
            String bookAuthor = UserInputStatic.inputString("Введите автора книги : ");

            Book savedBook = bookService.registerBook(bookTitle, bookAuthor);

            if (savedBook != null) {
                System.out.println("Книга " + bookTitle + " автор " + bookAuthor + " успешно добавлена в библиотеку");
            } else {
                System.out.println("Добавить книгу не удалось.");
            }
        }
    }

    public void printAllBook() {
        Book[] books = bookService.getAllBooks();
        boolean hasBooks = false;

        System.out.println("Список всех книг:");
        System.out.print("[ ");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (hasBooks) {
                    System.out.print(", ");
                }
                System.out.println(books[i]);
                hasBooks = true;
            }
        }
        System.out.println("]");
    }

    private void searchById() {
        int id = UserInputStatic.inputInt("Введите ID книги: ");

        Book book = bookService.findById(id);
        if (book != null) {
            System.out.println("Найдена книга: " + book);
        } else {
            System.out.println("Книга с таким ID не найдена.");
        }
    }

    private void searchByTitle() {
        String title = UserInputStatic.inputString("Введите название книги: ");

        Book book = bookService.findByTitle(title);
        if (book != null) {
            System.out.println("Найдена книга: " + book);
        } else {
            System.out.println("Книга с таким названием не найдена.");
        }
    }
}

