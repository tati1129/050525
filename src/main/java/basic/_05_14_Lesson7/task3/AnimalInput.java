package basic._05_14_Lesson7.task3;

import java.util.Scanner;

public class AnimalInput {
    Scanner scanner;

    public AnimalInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputText(String message) {

        Scanner sc = new Scanner(System.in);
        String inputText = scanner.nextLine();
        return inputText;
    }

    public int inputInt(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.println(message);
        int inputInt = scanner.nextInt();
        return inputInt;
    }
}
