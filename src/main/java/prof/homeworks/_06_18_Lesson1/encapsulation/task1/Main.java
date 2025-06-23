package prof.homeworks._06_18_Lesson1.encapsulation.task1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ann", "Smith", 25000);
        AccountService service = new AccountService(account);

        service.deposit(3500);
        service.withdraw(240000);
        service.withdraw(24000);
    }


}
