package basic._06_10_Lesson20.var3;

import basic._06_10_Lesson20.UserInputStatic;

public class UserInterface {
    BookService bookService;

    public UserInterface(BookService bookService) {
        this.bookService = bookService;
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("-------------------------");
            System.out.println("Виды операций:");
            System.out.println("1. Создать новую книгу");
            System.out.println("2. Вывод информации о всех книгах");
            System.out.println("3. Поиск книги на номеру каталога");
            System.out.println("4. Поиск книг на автору");
            System.out.println("5. Поиск книги на названию");
            System.out.println("6. Завершение работы");
            System.out.println("-------------------------");

            int userChoice = UserInputStatic.inputInt("Выберите операцию : ");
            switch (userChoice) {
                case 1 -> registerNewBook();
                case 2 -> printAllBook();
                case 3 -> findById();
                case 4 -> findByAuthor();
                case 5 -> findByTitle();
                case 6 -> {
                    System.out.println("До свидания!");
                    exit = true;
                }
                default -> System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }


    private void registerNewBook() {
        int bookCounter = UserInputStatic.inputInt("Сколько книг хотите зарегистрировать?");

        for (int i = 0; i < bookCounter; i++) {
            String bookId = UserInputStatic.inputString("Введите номер каталога книги : ");
            String bookTitle = UserInputStatic.inputString("Введите название книги : ");
            String bookAuthor = UserInputStatic.inputString("Введите автора книги : ");

            Book savedBook = new Book(bookId, bookTitle, bookAuthor);
            boolean isSaved = bookService.addNewBook(savedBook);

            if (isSaved) {
                System.out.println("Книга " + bookTitle + " автор " + bookAuthor + " успешно добавлена в библиотеку");
            } else {
                System.out.println("Добавить книгу не удалось.");
            }
        }
    }

    private void printAllBook() {
        Book[] books = bookService.getAllBooks();
        boolean hasBooks = false;

        System.out.println("Список всех книг:");
        System.out.print("[ ");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                hasBooks = true;
                System.out.println("Номер каталога: " + books[i].getBookId() +
                        ", Автор: " + books[i].getAuthor() +
                        ", Название: " + books[i].getTitle());
            }
        }
        System.out.println("]");

        if (!hasBooks) {
            System.out.println("[Нет книг в библиотеке]");
        }
    }

    private void findById() {

        String id = UserInputStatic.inputString("Введите ID книги: ");
        Book book = bookService.findByID(id);
        if (book != null) {
            System.out.println("Книга найдена:");
            System.out.println("Номер каталога: " + book.getBookId() +
                    ", Автор: " + book.getAuthor() +
                    ", Название: " + book.getTitle());
        } else {
            System.out.println("Книга с таким ID не найдена.");
        }
    }

    private void findByTitle() {
        String title = UserInputStatic.inputString("Введите название книги: ");

        Book book = bookService.findByTitle(title);
        if (book != null) {
            System.out.println("Найдена книга: " + book);
        } else {
            System.out.println("Книга с таким названием не найдена.");
        }
    }

    private void findByAuthor() {
        String author = UserInputStatic.inputString("Введите автора книги: ");

        Book[] book = bookService.findByAuthor(author);
        if (book != null) {
            System.out.println("Найдена автор: " + author);
        } else {
            System.out.println("Книга с таким автором не найдена.");
        }
    }
}
