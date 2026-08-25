abstract class PaymentMethod {
    abstract void makePayment();

    void showMessage() {
        System.out.println("Payment System");
    }
}

class CreditCardPay extends PaymentMethod {
    void makePayment() {
        System.out.println("Payment made using Credit Card");
    }
}

class UpiPay extends PaymentMethod {
    void makePayment() {
        System.out.println("Payment made using UPI");
    }
}

public class PaymentAbstractDemo {
    public static void main(String[] args) {
        CreditCardPay card = new CreditCardPay();
        UpiPay upi = new UpiPay();

        card.showMessage();
        card.makePayment();

        upi.makePayment();
    }
}