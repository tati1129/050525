package prof.homeworks._06_18_Lesson1.encapsulation.task1;

public class AccountService {
    private BankAccount account;

    public AccountService(BankAccount account) {
        this.account = account;
    }

    public void deposit(int money) {
        account.addToBalance(money);
        System.out.println("Operation successful!");
        System.out.println("Your balance : " + account.getBalance());
    }

    public void withdraw(int money) {
        if (account.getBalance() < money) {
            System.out.println("Not enough on your account for this operation!");
        } else {
            account.subbstractFromBalance(money);
            System.out.println("Operation successful!");
        }

        System.out.println("Your balance : " + account.getBalance());

    }
}
