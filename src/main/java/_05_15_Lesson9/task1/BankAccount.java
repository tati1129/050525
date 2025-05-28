package _05_15_Lesson9.task1;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double accountBalance;
    private double interestRate;

    public BankAccount(String accountNumber, String accountHolder, double accountBalance, int interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.interestRate = interestRate;
    }

    public double calculateInterest(int months){
      return   accountBalance * interestRate / 100 /12 * months;
    };

    public void printAccountInfo(){
        System.out.println("Name : " + accountHolder + " , balance : " + accountBalance);
    };

    public void deposit(int amount){
        accountBalance = accountBalance + amount;
        System.out.println("You add : " + amount + " Balance : "+ accountBalance);
    };

    public void withdraw(int amount){
        if (accountBalance >= amount){
            accountBalance = Math.round((accountBalance - amount) *100.0) / 100.0;
            System.out.println("You withdraw : " + amount + " Balance : "+ accountBalance);
        }else {
            System.out.println("Not enought on your balance");
        }

    };
}
