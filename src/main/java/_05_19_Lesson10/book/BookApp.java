package _05_19_Lesson10.book;

public class BookApp {
    public static void main(String[] args) {
        BookService service = new BookService();

       Book book1 =  service.createrBook();
       Book book2 =  service.createrBook();

        System.out.println(book1);
        System.out.println(book2);
    }
}
