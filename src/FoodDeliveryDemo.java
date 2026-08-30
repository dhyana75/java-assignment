import java.util.ArrayList;

interface DeliveryStatusDemo {
    void updateStatus();
}

class FoodDeliveryDemo {

    String customerName;
    ArrayList<String> orders;

    FoodDeliveryDemo(String customerName) {
        this.customerName = customerName;
        orders = new ArrayList<String>();
    }

    class OrderDetails {

        void addOrder(String food) {
            orders.add(food);
        }

        void displayOrders() {
            System.out.println("----- Order Details -----");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Orders:");

            for (String food : orders) {
                System.out.println("- " + food);
            }
        }
    }

    public static void main(String[] args) {

        FoodDeliveryDemo order = new FoodDeliveryDemo("Dhyana");

        OrderDetails details = order.new OrderDetails();

        details.addOrder("Pizza");
        details.addOrder("Burger");
        details.addOrder("French Fries");

        details.displayOrders();

        DeliveryStatusDemo preparing = new DeliveryStatusDemo() {
            public void updateStatus() {
                System.out.println("Status: Order is being prepared.");
            }
        };

        DeliveryStatusDemo delivery = new DeliveryStatusDemo() {
            public void updateStatus() {
                System.out.println("Status: Order is out for delivery.");
            }
        };

        preparing.updateStatus();
        delivery.updateStatus();
    }
}