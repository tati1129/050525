package prof.lessons._07_02_Lesson7.practice.task2.book;

import java.util.Comparator;

public class BookCompareByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
