package basic._06_10_Lesson20;

import java.util.Scanner;

public class UserInputStatic {
    static Scanner sc = new Scanner(System.in);


    public static String inputString(String message){
        System.out.println(message);
        String input = sc.nextLine();
        return input;
    }

    public static int inputInt(String message){
        System.out.println(message);
        int input = sc.nextInt();
        sc.nextLine();
        return input;
    }
    public static double inputDouble(String message){
        System.out.println(message);
        double input = sc.nextInt();
        sc.nextLine();
        return input;
    }
    public static boolean inputBoolean(String message){
        System.out.println(message);
        boolean input = sc.nextBoolean();
        return input;
    }
    public static void closeScanner(){
        sc.close();
    }
}
