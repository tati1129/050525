package _05_14_Lesson7.scanner;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a producer of item : ");
        String producer = sc.nextLine();

        System.out.println("Enter a title of item : ");
        String title = sc.nextLine();

        System.out.println("Enter a price : ");
        double price = sc.nextDouble();

//        System.out.println("The producer of item : " + producer);
//        System.out.println("The title of item : " + title);
//        System.out.println("The price : " + price);

        Item item = new Item(producer, title, price);
        System.out.println();
        sc.close();
    }
}
