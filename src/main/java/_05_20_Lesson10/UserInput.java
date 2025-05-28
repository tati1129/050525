package _05_20_Lesson10;

import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);


    public String inputText(String message) {

        System.out.println(message);
        String inputText = scanner.nextLine();
        return inputText;
    }


    public int inputInt(String message) {

        System.out.println(message);
        int inputInt = scanner.nextInt();
        scanner.nextLine();
        return inputInt;
    }

    public double inputDouble(String message) {

        System.out.println(message);
        double inputDouble = scanner.nextDouble();
        scanner.nextLine();
        return inputDouble;

    }
}
