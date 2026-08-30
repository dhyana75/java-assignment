import java.util.Scanner;

public class ATMPinExceptionDemo {

    static void verifyPin(int enteredPin) throws Exception {

        int correctPin = 2468;

        if (enteredPin != correctPin) {
            throw new Exception("Invalid ATM PIN.");
        }

        System.out.println("PIN verified successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ATM PIN: ");
            int pinInput = sc.nextInt();

            verifyPin(pinInput);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("PIN verification process completed.");
        }

        sc.close();
    }
}