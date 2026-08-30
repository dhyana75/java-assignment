import java.util.Scanner;

public class ATMExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int accountBalance = 10000;

        try {
            System.out.print("Enter withdrawal amount: ");
            int withdrawAmount = sc.nextInt();

            if (withdrawAmount <= 0) {
                throw new Exception("Withdrawal amount must be greater than zero.");
            }

            if (withdrawAmount > accountBalance) {
                throw new Exception("Insufficient balance.");
            }

            accountBalance = accountBalance - withdrawAmount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + accountBalance);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}