package basic.homeWorks._05_15_Lesson10.phone.var4;

import java.util.Scanner;

public class PhoneService {

    public void changeMode(Phone phone) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want change silent mode? Choose 'y/n' ");

        String newStatus = sc.nextLine();

        phone.setIsSilent(newStatus);
        sc.close();
    }

}
