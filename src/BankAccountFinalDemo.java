public class BankAccountFinalDemo {
    final int accountNumber = 45821;
    String accountHolder = "Neha";
    double balance = 25000;

    final void showAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccountFinalDemo account = new BankAccountFinalDemo();

        account.showAccount();

        // accountNumber = 50000;
        // This gives an error because accountNumber is final.
    }
}