package homeWorks._05_15_Lesson10.phone.var2;

import java.util.Scanner;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "white", "n");
        System.out.println("1 : " + phone);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want change silent mode? Choose 'y/n' ");

        String newStatus = scanner.nextLine();
        phone.setIsSilent(newStatus);

        System.out.println("2 : " + phone);

    }
}