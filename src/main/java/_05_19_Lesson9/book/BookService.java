package _05_19_Lesson9.book;

import javaPro3._05_19.UserInput;

public class BookService {
    public Book createrBook(){
        UserInput input = new UserInput();

        String bookTitle = input.inputText("Enter book title :");
        String bookAuthor = input.inputText("Enter book author :");

        Book book = new Book(bookTitle, bookAuthor);
        return  book;
    }
}
