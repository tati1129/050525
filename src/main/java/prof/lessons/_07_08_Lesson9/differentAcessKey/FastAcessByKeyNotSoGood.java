package prof.lessons._07_08_Lesson9.differentAcessKey;

import java.util.ArrayList;
import java.util.List;

public class FastAcessByKeyNotSoGood {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("123-456-789","Три мушкетера"));
        books.add(new Book("222-456-789","Три товарища"));
        books.add(new Book("333-456-789","Три поросенка"));
        books.add(new Book("555-456-789","Три толстяка"));

        Book bookKey1 = searchByKey("123-456-789", books);

    }

    public static Book searchByKey(String key, List<Book> books){
        for (Book book : books){
            if (book.getKeyISBN().equals(key)){
                return book;
            }
        }

        return null;
    }
}
