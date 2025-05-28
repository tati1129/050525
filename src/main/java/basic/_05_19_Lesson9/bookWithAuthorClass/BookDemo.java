package basic._05_19_Lesson9.bookWithAuthorClass;

public class BookDemo {
    public static void main(String[] args) {
        Author author1 = new Author("Ayn Rand", "story");
        Book book1 = new Book("Atlas", author1);

        System.out.println(author1);

        System.out.println(book1.getAuthor().getName());
        System.out.println(book1);
    }
}
