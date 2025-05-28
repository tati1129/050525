package basic._05_13_Lesson6.tasks;

public class Library {
    String name;
    String adress;
    int quantity;

    public Library(String name, String adress, int quantity) {
        this.name = name;
        this.adress = adress;
        this.quantity = quantity;
    }
    public void issueBook(){
        quantity -= 1;
        System.out.println("Выдали книгу");
    }
    public void returnBook(){
        quantity += 1;
        System.out.println("Читатель вернул книгу");
    }

    public void printInfo(){
        System.out.println("Название библиотеки " + name);
        System.out.println("Адресс : " + adress);
        System.out.println("Количество книг в наличии : " + quantity);
        System.out.println("_____________________________________");
    }
}
