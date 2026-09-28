import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new AgeException("You are not eligible for voting.");
            }

            System.out.println("You are eligible for voting.");
        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}