public class Main {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet(50);

        myWallet.deposit(100);
        myWallet.withdraw(40);
        myWallet.withdraw(150);
        System.out.println("final balance:" + myWallet.getBalance());
        myWallet.printTransactionHistory();
    }
}
