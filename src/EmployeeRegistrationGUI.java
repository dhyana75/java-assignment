import javax.swing.*;
import java.awt.*;

public class EmployeeRegistrationGUI extends JFrame {

    JTextField idField;
    JTextField nameField;
    JTextField departmentField;
    JTextField salaryField;
    JButton submitButton;

    EmployeeRegistrationGUI() {

        setTitle("Employee Registration Form");
        setSize(450, 350);
        setLayout(new FlowLayout());

        JLabel idLabel = new JLabel("Employee ID:");
        idField = new JTextField(20);

        JLabel nameLabel = new JLabel("Employee Name:");
        nameField = new JTextField(20);

        JLabel deptLabel = new JLabel("Department:");
        departmentField = new JTextField(20);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(20);

        submitButton = new JButton("Submit");

        add(idLabel);
        add(idField);

        add(nameLabel);
        add(nameField);

        add(deptLabel);
        add(departmentField);

        add(salaryLabel);
        add(salaryField);

        add(submitButton);

        submitButton.addActionListener(e -> {

            String empId = idField.getText();
            String empName = nameField.getText();
            String department = departmentField.getText();
            String salary = salaryField.getText();

            JOptionPane.showMessageDialog(
                    this,
                    "Employee Details\n\n"
                            + "Employee ID: " + empId + "\n"
                            + "Name: " + empName + "\n"
                            + "Department: " + department + "\n"
                            + "Salary: " + salary
            );
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeRegistrationGUI();
    }
}