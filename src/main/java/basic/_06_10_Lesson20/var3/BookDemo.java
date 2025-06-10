package basic._06_10_Lesson20.var3;


public class BookDemo {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        UserInterface userInterface = new UserInterface(bookService);



userInterface.start();
    }
}
