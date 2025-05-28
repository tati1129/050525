package homeWorks._05_13_Lesson8.books;

public class BookDemo {
    public static void main(String[] args) {

        Book book = new Book("Ayn Rand","Atlas Shrugged", true);
        book.issueBook();

        book.returnBook();
    }

}
