public class Main {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();

        myWallet.deposit(2000);
        myWallet.withdraw(500);
        myWallet.withdraw(150);
        System.out.println("final balance:" + myWallet.getBalance());
    }
}
