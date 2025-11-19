
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("++++++++++++++++++ Wallet Application ++++++++++++++++++");
        System.err.println("Entaer Initial Balance:");

        double initialBalance = scanner.nextDouble();
        Wallet myWallet = new Wallet(initialBalance);

        while (true) { 
            System.out.println("\n ================ Menu ===============");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.err.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    myWallet.deposit(depositAmount);
                    break;
                case 2:
                    System.err.println("Enter withdraw amount:");
                    double withdrawAmount = scanner.nextDouble();
                    myWallet.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + myWallet.getBalance());
                    break;
                case 4:
                    myWallet.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the Wallet Application!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid Option... Try again");
            }
        }

        // Wallet myWallet = new Wallet(50);

        // myWallet.deposit(100);
        // myWallet.withdraw(40);
        // myWallet.withdraw(150);
        // System.out.println("final balance:" + myWallet.getBalance());
        // myWallet.printTransactionHistory();
    }
}
