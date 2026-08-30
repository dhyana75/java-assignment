import java.util.Scanner;

public class ShoppingExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product name: ");
            String productName = sc.nextLine();

            System.out.print("Enter product quantity: ");
            int productQuantity = sc.nextInt();

            if (productQuantity <= 0) {
                throw new Exception("Quantity must be greater than zero.");
            }

            System.out.println("\nOrder Details:");
            System.out.println("Product: " + productName);
            System.out.println("Quantity: " + productQuantity);
            System.out.println("Order placed successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}