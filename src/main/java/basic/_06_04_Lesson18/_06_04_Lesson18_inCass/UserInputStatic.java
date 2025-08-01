package basic._06_04_Lesson18._06_04_Lesson18_inCass;

import java.util.Scanner;

public class UserInputStatic {
    static Scanner sc = new Scanner(System.in);


    public static String inputString(String message) {
        System.out.println(message);
        String input = sc.nextLine();
        return input;
    }

    public static int inputInt(String message) {
        System.out.println(message);
        int input = sc.nextInt();
        sc.nextLine();
        return input;
    }

    public static double inputDouble(String message) {
        System.out.println(message);
        double input = sc.nextInt();
        sc.nextLine();
        return input;
    }

    public static boolean inputBoolean(String message) {
        System.out.println(message);
        boolean input = sc.hasNextBoolean();
        return input;
    }

    public static void closeScanner() {
        sc.close();
    }
}
