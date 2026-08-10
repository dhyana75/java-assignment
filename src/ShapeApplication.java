class ShapeDetails {
    double calculateArea() {
        return 0;
    }
}

class RoundShape extends ShapeDetails {
    double radius;

    RoundShape(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class BoxShape extends ShapeDetails {
    double length;
    double width;

    BoxShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class ShapeApplication {
    public static void main(String[] args) {

        RoundShape round = new RoundShape(5);
        BoxShape box = new BoxShape(10, 4);

        System.out.println("Area of Circle: " + round.calculateArea());
        System.out.println("Area of Rectangle: " + box.calculateArea());
    }
}