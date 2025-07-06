package prof.lessons._07_02_Lesson7.practice.task2.book;

import java.util.*;

public class BookDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Atlas Shrugged", "Rand Ayn", 1990));
        books.add(new Book("Shantaram", "Roberts Gregory", 2010));
        books.add(new Book("Idiot", "Dostoyevskiy Fedor", 1970));
        books.add(new Book("Broters Karamazovy", "Dostoyevskiy Fedor", 1980));
        books.add(new Book("The Fountainhead", "Rand Ayn", 1990));


        // Сортировка по названию
        Collections.sort(books, new BookCompareByTitle());
        System.out.println("Sorted by Title : ");
        for (Book book : books) {
            System.out.println(book);
        }

        // Сортировка по автору
        Collections.sort(books, new BookCompareByAuthor());
        System.out.println("\nSorted by Author : ");
        for (Book book : books) {
            System.out.println(book);
        }

        // Сортировка по году издания
        Collections.sort(books, new BookCompareByYear());
        System.out.println("\nSorted by Year:");
        for (Book book : books) {
            System.out.println(book);
        }


    }


}
