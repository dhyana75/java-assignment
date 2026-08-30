import java.util.Scanner;

public class LoginExceptionDemo {

    static void checkPassword(String password) throws Exception {

        if (!password.equals("java123")) {
            throw new Exception("Invalid password.");
        }

        System.out.println("Login successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String enteredPassword = sc.nextLine();

            checkPassword(enteredPassword);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Login process completed.");
        }

        sc.close();
    }
}