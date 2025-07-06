package basic._06_10_Lesson20.var1;

import basic._06_10_Lesson20.UserInputStatic;

public class BookDemo {
    public static void main(String[] args) {
        int libraryize = UserInputStatic.inputInt("Сколько книг в библиотеке? ");

        Book[] library = new Book[libraryize];

        for (int i = 0; i < library.length; i++) {

            String bookId = UserInputStatic.inputString("Введите id книги");
            String bookTitle = UserInputStatic.inputString("Введите название книги");
            String bookAuthor = UserInputStatic.inputString("Введите автора книги");

            Book book = new Book(bookId, bookTitle, bookAuthor);

            library[i] = book;
        }

        System.out.println(" Список книг : ");

        for (int i = 0; i < library.length; i++) {
            Book currentBook = library[i];

            System.out.println("Номер каталога : " + currentBook.getBookId());
            System.out.println("Название книги : " + currentBook.getTitle());
            System.out.println("Имя Автора : " + currentBook.getAuthor());
        }

        String bookIdSearch = UserInputStatic.inputString("Книгу с каким номером каталога нужно найти? ");

        for (int i = 0; i < library.length; i++) {
            Book current = library[i];
            if (current.getBookId().equals(bookIdSearch)) {
                System.out.println("Нашли книгу по поиску:");
                System.out.println("Номер каталога : " + current.getBookId());
                System.out.println("Название книги : " + current.getTitle());
                System.out.println("Имя Автора : " + current.getAuthor());
            }
        }
    }

}
