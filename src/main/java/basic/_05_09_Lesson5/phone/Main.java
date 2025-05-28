package basic._05_09_Lesson5.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.producer = "China";
        phone1.model = "PF23998";
        phone1.diagonalScreen = 21.2;
        phone1.memorySize = 100;
        phone1.color = "Black";
        phone1.countPixel = 64;
        phone1.typeCharge = true;
        System.out.println("phone1 : ");
        System.out.println(phone1.producer);
        System.out.println(phone1.model);
        System.out.println(phone1.diagonalScreen);
        System.out.println(phone1.memorySize);
        System.out.println(phone1.color);
        System.out.println(phone1.countPixel);
        System.out.println(phone1.typeCharge);

        System.out.println("____________________");

        Phone phone2 = new Phone();
        phone2.producer = "US";
        phone2.model = "16Pro";
        phone2.diagonalScreen = 25.2;
        phone2.memorySize = 500;
        phone2.color = "White";
        phone2.countPixel = 64;
        phone2.typeCharge = true;
        System.out.println("phone2 : ");
        System.out.println(phone2.producer);
        System.out.println(phone2.model);
        System.out.println(phone2.diagonalScreen);
        System.out.println(phone2.memorySize);
        System.out.println(phone2.color);
        System.out.println(phone2.countPixel);
        System.out.println(phone2.typeCharge);


    }
}
