package basic._05_14_Lesson7.task2;

import java.util.Scanner;

public class ProductInput {
    Scanner scanner;

    public ProductInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputText(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        String inputText = scanner.nextLine();
        return inputText;
    }


    public int inputInt(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        int inputInt = scanner.nextInt();
        return inputInt;
    }

    public double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        double inputDouble = scanner.nextDouble();
        return inputDouble;
    }
}
