interface Action {
    void performAction();
}

class Vehicle {
    String vehicleName;
    String vehicleNumber;

    Vehicle(String vehicleName, String vehicleNumber) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    // Inner class
    class VehicleDetails {
        void displayDetails() {
            System.out.println("Vehicle Name: " + vehicleName);
            System.out.println("Vehicle Number: " + vehicleNumber);
        }
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle("Honda City", "MH12AB1234");

        // Creating object of inner class
        VehicleDetails details = v.new VehicleDetails();
        details.displayDetails();

        // Anonymous class
        Action action = new Action() {
            public void performAction() {
                System.out.println("Vehicle is moving.");
            }
        };

        action.performAction();
    }
}