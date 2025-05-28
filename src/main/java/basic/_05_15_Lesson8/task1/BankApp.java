package basic._05_15_Lesson8.task1;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("717", "Tom", 827.9, 10);

        bankAccount.deposit(10000);
        bankAccount.printAccountInfo();

        bankAccount.withdraw(10000);
    }
}
