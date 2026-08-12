interface Product {
    void displayProduct();
}

class Electronic implements Product {
    String name;
    double price;

    Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Electronic Product: " + name);
        System.out.println("Price: " + price);
    }
}

class Clothing implements Product {
    String name;
    double price;

    Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Clothing Product: " + name);
        System.out.println("Price: " + price);
    }
}

class Grocery implements Product {
    String name;
    double price;

    Grocery(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Grocery Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class Ecommerce {
    public static void main(String[] args) {

        Electronic e = new Electronic("Headphones", 1500);
        Clothing c = new Clothing("T-Shirt", 800);
        Grocery g = new Grocery("Rice", 500);

        e.displayProduct();
        System.out.println();

        c.displayProduct();
        System.out.println();

        g.displayProduct();
    }
}