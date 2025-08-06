package prof.lessons._08_06_Lesson16.javainputoutput.standart;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String line = scanner.nextLine();
        System.out.println("Вы ввели: " + line);
        scanner.close();

        String data = "Hello,\nWorld!";
        Scanner scanFromString = new Scanner(data);

        System.out.println(scanFromString.nextLine());
        System.out.println(scanFromString.nextLine());
    }
}
