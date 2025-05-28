package homeWorks._05_15_Lesson10.light.var1;

import java.util.Scanner;

public class LightService {
    Scanner sc = new Scanner(System.in);

    public void changeMode(Light light){
        System.out.println("Do you want change silent mode? Choose 'y/n' ");
        String newStatus = sc.nextLine();

        light.setOn(newStatus);
    }

    public void changeBrightness(Light light){
        System.out.println("Do you want change brightness mode? Enter integer from 0 to 100 ");
        int newBrightness =  sc.nextInt();
        light.setBrightness(newBrightness);
    }

    public void closeScanner() {
        sc.close();
    }
}
