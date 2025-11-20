
import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private double balance;
    private List<Transaction> transactionHistory;

    // Constructor
    public Wallet(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add(new Transaction( initialBalance, "INITIAL_BALANCE"));

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction(amount, "DEPOSI"));
            System.out.println("Deposited: " + amount);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            transactionHistory.add(new Transaction(amount, "WITHDRAW"));
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public  void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
