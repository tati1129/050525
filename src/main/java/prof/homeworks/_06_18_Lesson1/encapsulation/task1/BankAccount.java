package prof.homeworks._06_18_Lesson1.encapsulation.task1;

public class BankAccount {
    private String firstName;
    private String lastName;
    private int balance;

    public BankAccount(String firstName, String lastName, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getBalance() {
        return balance;
    }

    void addToBalance(int amount) {
        this.balance += amount;
    }

    void subbstractFromBalance(int amount) {
        this.balance -= amount;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
