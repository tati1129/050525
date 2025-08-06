package prof.lessons._07_30_Lesson13.app.repository;



import prof.lessons._07_30_Lesson13.app.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
   private final List<Book> books =new ArrayList<>();

   public List<Book> findAll(){
       return books;
   }

   public boolean saveBook(Book book){
       return books.add(book);
   }
   public Optional<Book> findById(String isbnForSearch){
       for (Book book : books){
           if (book.getIsbn().equals(isbnForSearch)) {
               return Optional.of(book);
           }
       }
       return Optional.empty();
   }

    public List<Book> findByTitle(String title){
        List<Book> booksByTitle = new ArrayList<>();

        for (Book book : books){
            if (book.getTitle().equals(title)){
               booksByTitle.add(book);
            }
        }
        return  booksByTitle;
    }

   public List<Book> findByAuthor(String author){
       List<Book> booksByAuthor = new ArrayList<>();

       for (Book book : books){
           if (book.getAuthor().getAuthorName().equals(author)){
               booksByAuthor.add(book);
           }
       }
       return  booksByAuthor;
   }

 }
