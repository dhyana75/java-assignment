import java.util.Scanner;

class LicenseException extends Exception {
    LicenseException(String message) {
        super(message);
    }
}

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new LicenseException("You are not eligible for a driving license.");
            }

            System.out.println("You are eligible for a driving license.");
        }
        catch (LicenseException e) {
            System.out.println(e.getMessage());
        }
    }
}