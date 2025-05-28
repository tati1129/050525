package homeWorks._05_12_Lesson7.bibliotek;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Atlas Shrugged";
        book1.author = "Ayn Rand";
        book1.year = 1957;
        book1.isIssued = true;
        System.out.println("__________________________");
        System.out.println("Book 1 : ");
        System.out.println("book title : " + book1.title);
        System.out.println("book author : " + book1.author);
        System.out.println("year : " + book1.year);
        System.out.println("book is Issued : " + book1.isIssued);


        Book book2 = new Book();

        book2.title = "Tuareg";
        book2.author = "Alberto Vázquez-Figueroa";
        book2.year = 1980;
        book2.isIssued = false;

        System.out.println("__________________________");
        System.out.println("Book 1 : ");
        System.out.println("book title : " + book2.title);
        System.out.println("book author : " + book2.author);
        System.out.println("year : " + book2.year);
        System.out.println("book is Issued : " + book2.isIssued);

    }
}
