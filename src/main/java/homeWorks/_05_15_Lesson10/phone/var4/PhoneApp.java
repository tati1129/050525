package homeWorks._05_15_Lesson10.phone.var4;


public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone("IPhone", "black", "y");

        PhoneService service = new PhoneService();
        System.out.println("1 : " + phone);
        service.changeMode(phone);
        System.out.println("2 : " + phone);

    }
}
