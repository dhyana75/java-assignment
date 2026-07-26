class Mobile {
    String brand;
    String model;
    int price;

    // Default Constructor
    Mobile() {
        brand = "Samsung";
        model = "Galaxy A15";
        price = 18000;
    }

    // Parameterized Constructor
    Mobile(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    // Copy Constructor
    Mobile(Mobile obj) {
        brand = obj.brand;
        model = obj.model;
        price = obj.price;
    }

    // Display Method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // default constructor
        Mobile m1 = new Mobile();

        // parameterized constructor
        Mobile m2 = new Mobile("Apple", "iPhone 15", 75000);

        // copy constructor
        Mobile m3 = new Mobile(m2);

        System.out.println("Mobile 1:");
        m1.display();

        System.out.println();

        System.out.println("Mobile 2:");
        m2.display();

        System.out.println();

        System.out.println("Duplicate Mobile Record:");
        m3.display();
    }
}