package basic._06_10_Lesson20.var3;

import basic._06_10_Lesson20.UserInputStatic;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public boolean addNewBook(Book newBook) {
        if (validateNewBook(newBook)) {
            return bookRepository.save(newBook);
        } else {
            return false;
        }
    }

    private boolean validateNewBook(Book newBook) {
        if (newBook.getBookId().isBlank()) {
            return false;
        }
        if (newBook.getTitle().isBlank()) {
            return false;
        }
        if (newBook.getAuthor().isBlank()) {
            return false;
        }
        if (bookRepository.findByBookId(newBook.getBookId()) != null) {
            return false;
        }
        if (bookRepository.findByBookTitle(newBook.getTitle()) != null) {
            return false;
        }
        if (bookRepository.findByBookAuthor(newBook.getAuthor()) != null) {
            return false;
        }
        return true;
    }

    public Book findByID(String bookId) {
        return bookRepository.findByBookId(bookId);
    }

    public Book findByTitle(String bookTitle) {
        return bookRepository.findByBookTitle(bookTitle);
    }

    public Book[] findByAuthor(String bookAuthor) {
        return bookRepository.findByBookAuthor(bookAuthor);
    }

    public void printLibraryInfo(Book[] library, int currentQuantity) {
        System.out.println(" -------- полный список книг ------------");

        for (int i = 0; i < currentQuantity; i++) {

            Book currentBook = library[i];
            System.out.print("Номер каталога: " + currentBook.getBookId());
            System.out.print(", Автор книги: " + currentBook.getAuthor());
            System.out.print(", Название книги: " + currentBook.getTitle());
            System.out.println();
        }
    }


    public void findBookByCatalogNumber(Book[] library, int currentQuantity) {
        String bookIdSearch = UserInputStatic.inputString("Книгу с каким номером каталога нужно найти:");
        boolean isNotFind = true;

        // ищем по книгам
        for (int i = 0; i < currentQuantity; i++) {
            Book currentBook = library[i];

            if (currentBook.getBookId().equals(bookIdSearch)) {
                isNotFind = false;
                System.out.println("Нашли книгу по поиску:");
                System.out.print("Номер каталога: " + currentBook.getBookId());
                System.out.print(", Автор книги: " + currentBook.getAuthor());
                System.out.print(", Название книги: " + currentBook.getTitle());
                System.out.println();
            }
        }

        if (isNotFind) {
            System.out.println("Книги с номером в каталоге: " + bookIdSearch + " не найдено");
        }
    }


    public void findBooksByAuthor(Book[] library, int currentQuantity) {
        String bookAuthorSearch = UserInputStatic.inputString("Книги какого автором нужно найти:");
        boolean isNotFind = true;

        // ищем по книгам
        for (int i = 0; i < currentQuantity; i++) {
            Book currentBook = library[i];

            if (currentBook.getAuthor().equals(bookAuthorSearch)) {
                isNotFind = false;
                System.out.println("Нашли книгу по поиску:");
                System.out.print("Номер каталога: " + currentBook.getBookId());
                System.out.print(", Автор книги: " + currentBook.getAuthor());
                System.out.print(", Название книги: " + currentBook.getTitle());
                System.out.println();
            }
        }

        if (isNotFind) {
            System.out.println("Книги автора: " + bookAuthorSearch + " не найдены");
        }
    }

    public void findBooksByTitle(Book[] library, int currentQuantity) {
        String bookTitleSearch = UserInputStatic.inputString("Книгу с каким названием нужно найти:");
        boolean isNotFind = true;

        // ищем по книгам
        for (int i = 0; i < currentQuantity; i++) {
            Book currentBook = library[i];

            if (currentBook.getTitle().equals(bookTitleSearch)) {
                isNotFind = false;
                System.out.println("Нашли книгу по поиску:");
                System.out.print("Номер каталога: " + currentBook.getBookId());
                System.out.print(", Автор книги: " + currentBook.getAuthor());
                System.out.print(", Название книги: " + currentBook.getTitle());
                System.out.println();
            }
        }

        if (isNotFind) {
            System.out.println("Книга с названием: " + bookTitleSearch + " не найдена");
        }
    }

    public Book[] getAllBooks() {
        return bookRepository.getLibrary();
    }
}
