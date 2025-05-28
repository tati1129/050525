package _05_14_Lesson7.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter text message : ");
        String inputMessage = sc.nextLine();
        System.out.println("Your text : " + inputMessage);

        System.out.println("Enter an integer : ");
        int inputInt = sc.nextInt();
        System.out.println("Your number : " + inputInt);

        sc.close();
    }
}
