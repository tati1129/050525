package basic.homeWorks._05_26_Lesson13;

import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public static String inputText(String message) {
        System.out.println(message);
        String text = scanner.nextLine();
        return text;
    }

    public static int inputInt(String message) {
        System.out.println(message);
        int integer = scanner.nextInt();
        scanner.nextLine();
        return integer;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
