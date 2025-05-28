package basic.homeWorks._05_22_Lesson12;

import java.util.Scanner;

public class UserInputStatic {
    static Scanner scanner = new Scanner(System.in);

    public static String inputText(String message){
        System.out.println(message);
        String inputText = scanner.nextLine();
        return inputText;
    }

    public static int inputInt(String message){
        System.out.println(message);
        int inputInt = scanner.nextInt();
        scanner.nextLine();
        return inputInt;
    }
    public static double inputDouble(String message){
        System.out.println(message);
        double inputDouble = scanner.nextDouble();
        scanner.nextLine();
        return inputDouble;
    }
    public static void close(){
        scanner.close();
    }
}
