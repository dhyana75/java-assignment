class StaffMember {
    String staffName = "Rahul";
    int staffSalary = 30000;

    void showDetails() {
        System.out.println("Employee Name: " + staffName);
        System.out.println("Employee Salary: " + staffSalary);
    }
}

public class ManagerSuperDemo extends StaffMember {
    String staffName = "Amit";

    void displayManager() {
        System.out.println("Manager Name: " + staffName);

        // Accessing parent class variable using super
        System.out.println("Employee Name: " + super.staffName);
        System.out.println("Employee Salary: " + super.staffSalary);

        // Calling parent class method using super
        super.showDetails();
    }

    public static void main(String[] args) {
        ManagerSuperDemo obj = new ManagerSuperDemo();
        obj.displayManager();
    }
}