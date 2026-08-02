public class RestaurantBilling {

    static int totalOrders = 0;

    void calculateBill(double amount) {
        totalOrders++;
        System.out.println("Dine-in Order");
        System.out.println("Bill = Rs. " + amount);
        System.out.println();
    }

    void calculateBill(double amount, double packingCharge) {
        totalOrders++;
         double total = amount + packingCharge;
        System.out.println("Takeaway Order");
        System.out.println("Bill = Rs. " + total);
        System.out.println();
    }

    void calculateBill(double amount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        double total = amount + packingCharge + deliveryCharge;
        System.out.println("Delivery Order");
        System.out.println("Bill = Rs. " + total);
        System.out.println();
    }

    public static void main(String args[]) {

        RestaurantBilling r = new RestaurantBilling();

        // Dine-in
        r.calculateBill(500);

        // Takeaway
        r.calculateBill(450, 30);

        // Delivery
        r.calculateBill(400, 30, 50);

        System.out.println("Total Number of Orders = " + totalOrders);
    }
}