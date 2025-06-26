package prof.lessons._06_23_Lesson3.mediaLibrary.repisitory;

import prof.lessons._06_23_Lesson3.mediaLibrary.entity.Book;

public interface BookRepository {
    public Book save(Book book);

    public Book findByTitle(String title);

    public Book[] findByAuthor(String author);
}
