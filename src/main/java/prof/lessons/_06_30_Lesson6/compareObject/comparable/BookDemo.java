package prof.lessons._06_30_Lesson6.compareObject.comparable;

import java.util.Set;
import java.util.TreeSet;

public class BookDemo {
    public static void main(String[] args) {

        Set<Book> library = new TreeSet<>();

        library.add(new Book(10, "Book2"));
        library.add(new Book(2, "Book3"));
        library.add(new Book(1, "Book1"));
        library.add(new Book(7, "Book7"));
        library.add(new Book(5, "Book5"));
        library.add(new Book(1, "Book11"));
        library.add(new Book(12, "Book12"));
        library.add(new Book(7, "Book7"));

        for (Book myBook : library) {
            System.out.println("id : " + myBook.getId() + ", " + myBook.getTitle());
        }
    }
}
