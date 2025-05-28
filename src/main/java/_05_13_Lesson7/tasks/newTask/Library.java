package _05_13_Lesson7.tasks.newTask;

public class Library {
    String author;
    String bookTitle;
    int pages;
    int numberKatalog;
    boolean isInLibrary;

    public Library(String author, String bookTitle, int pages, int numberKatalog, boolean isInLibrary) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.pages = pages;
        this.numberKatalog = numberKatalog;
        this.isInLibrary = isInLibrary;
    }

    public Library(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public void createInfo(int numberKatalog, int pages, boolean isInLibrary){
        this.numberKatalog = numberKatalog;
        this.pages = pages;
        this.isInLibrary = isInLibrary;
    }
    public void handoutBook(){
        if (isInLibrary) {
            isInLibrary = false;
            System.out.println("Книга выдана.");
        } else {
            System.out.println("Книга уже на руках.");
        }
    }

    public void returnBook(){
        if (!isInLibrary) {
            isInLibrary = true;
            System.out.println("Книга возвращена в хранилище.");
        } else {
            System.out.println("Книга уже находится в хранилище.");
        }
    }
public void printInfo(){
    System.out.println("Автор: " + author);
    System.out.println("Название: " + bookTitle);
    System.out.println("Страниц: " + pages);
    System.out.println("Номер в каталоге: " + numberKatalog);
    System.out.println("Статус: " + (isInLibrary ? "В хранилище" : "На руках"));
}

}
