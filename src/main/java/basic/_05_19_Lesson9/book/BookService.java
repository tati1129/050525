package basic._05_19_Lesson9.book;

import basic._05_19_Lesson9.UserInput;

public class BookService {
    public Book createrBook() {
        UserInput input = new UserInput();

        String bookTitle = input.inputText("Enter book title :");
        String bookAuthor = input.inputText("Enter book author :");

        Book book = new Book(bookTitle, bookAuthor);
        return book;
    }
}
