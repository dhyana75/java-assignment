class VehicleInfo {
    String vehicleName = "Honda City";
    int vehicleYear = 2022;

    void showVehicle() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Vehicle Year: " + vehicleYear);
    }
}

public class VehicleInsuranceSuper extends VehicleInfo {
    String insuranceType = "Comprehensive";
    int insuranceAmount = 15000;

    void showInsurance() {
        System.out.println("Vehicle Name: " + super.vehicleName);
        System.out.println("Vehicle Year: " + super.vehicleYear);
        System.out.println("Insurance Type: " + insuranceType);
        System.out.println("Insurance Amount: " + insuranceAmount);

        super.showVehicle();
    }

    public static void main(String[] args) {
        VehicleInsuranceSuper obj = new VehicleInsuranceSuper();
        obj.showInsurance();
    }
}