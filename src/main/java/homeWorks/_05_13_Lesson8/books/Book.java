package homeWorks._05_13_Lesson8.books;

public class Book {
    String author;
    String title;
    boolean isInTheLibrary;

    public Book(String author, String title, boolean isInTheLibrary) {
        this.author = author;
        this.title = title;
        this.isInTheLibrary = isInTheLibrary;
    }
     public void issueBook(){
        if (isInTheLibrary){
            isInTheLibrary = false;
            System.out.println("The book '" + title + "' has been issued ");
        }else {

            System.out.println("The book '" + title + "' is not available at the moment.");
        }
     }

     public void returnBook(){
        if (!isInTheLibrary){
            isInTheLibrary = true;
            System.out.println("The book  '" + title + "' has been returned");
        }else {
            System.out.println("The book '" + title + "' is already in the library.");
        }
     }
}
