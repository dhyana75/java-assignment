abstract class FoodOrderBase {
    abstract void calculateBill();
}

class DineInOrder extends FoodOrderBase {
    int foodPrice = 500;
    int serviceCharge = 50;

    void calculateBill() {
        int total = foodPrice + serviceCharge;

        System.out.println("Dine-In Order");
        System.out.println("Food Price: " + foodPrice);
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println("Total Bill: " + total);
    }
}

class TakeAwayOrder extends FoodOrderBase {
    int foodPrice = 400;
    int packingCharge = 30;

    void calculateBill() {
        int total = foodPrice + packingCharge;

        System.out.println("Take-Away Order");
        System.out.println("Food Price: " + foodPrice);
        System.out.println("Packing Charge: " + packingCharge);
        System.out.println("Total Bill: " + total);
    }
}

public class FoodOrderAbstractDemo {
    public static void main(String[] args) {
        DineInOrder dine = new DineInOrder();
        TakeAwayOrder take = new TakeAwayOrder();

        dine.calculateBill();

        System.out.println();

        take.calculateBill();
    }
}