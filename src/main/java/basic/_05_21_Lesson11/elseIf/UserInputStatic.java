package basic._05_21_Lesson11.elseIf;

import java.util.Scanner;

public class UserInputStatic {
    static Scanner sc = new Scanner(System.in);

    public static String inputText(String message) {
        System.out.println(message);
        String inputText = sc.nextLine();
        return inputText;
    }

    public static int inputInt(String message) {
        System.out.println(message);
        int inputInt = sc.nextInt();
        sc.nextLine();
        return inputInt;
    }

    public static double inputDouble(String message){
        System.out.println(message);
        double inputDouble = sc.nextDouble();
        sc.nextLine();
        return inputDouble;
    }

    public static void close(){
        sc.close();
    }
}

