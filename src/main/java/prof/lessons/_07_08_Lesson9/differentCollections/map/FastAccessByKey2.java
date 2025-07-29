package prof.lessons._07_08_Lesson9.differentCollections.map;

import java.util.HashMap;
import java.util.Map;

public class FastAccessByKey2 {
    public static void main(String[] args) {

        Map<String, Book> bookMap = new HashMap<>();
        Book book1 = new Book("123-456-789","Три мушкетера");
        Book book2 = new Book("222-456-789","Три товарища");
        Book book3 = new Book("333-456-789","Три поросенка");
        Book book4 = new Book("555-456-789","Три толстяка");

        bookMap.put(book1.getKeyISBN(), book1);
        bookMap.put(book2.getKeyISBN(), book2);
        bookMap.put(book3.getKeyISBN(), book3);
        bookMap.put(book4.getKeyISBN(), book4);

        Book bookKey1 = bookMap.get("123-456-789");


    }

}
