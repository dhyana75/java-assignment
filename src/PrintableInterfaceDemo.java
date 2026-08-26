interface Printable {
    void printDetails();
}

class CollegeStudent implements Printable {
    String studentName = "Riya";
    int studentRoll = 25;

    public void printDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll No: " + studentRoll);
    }
}

class OfficeEmployee implements Printable {
    String employeeName = "Karan";
    int employeeId = 105;

    public void printDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class PrintableInterfaceDemo {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent();
        OfficeEmployee employee = new OfficeEmployee();

        student.printDetails();

        System.out.println();

        employee.printDetails();
    }
}