import javax.swing.*;
import java.awt.*;

public class StudentRegistrationGUI extends JFrame {

    JTextField nameField;
    JTextField rollField;
    JTextField courseField;
    JButton registerButton;

    StudentRegistrationGUI() {

        setTitle("Student Registration Form");
        setSize(400, 300);
        setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Student Name:");
        nameField = new JTextField(20);

        JLabel rollLabel = new JLabel("Roll Number:");
        rollField = new JTextField(20);

        JLabel courseLabel = new JLabel("Course:");
        courseField = new JTextField(20);

        registerButton = new JButton("Register");

        add(nameLabel);
        add(nameField);

        add(rollLabel);
        add(rollField);

        add(courseLabel);
        add(courseField);

        add(registerButton);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String roll = rollField.getText();
            String course = courseField.getText();

            JOptionPane.showMessageDialog(
                    this,
                    "Student Registered Successfully!\n\n"
                            + "Name: " + name + "\n"
                            + "Roll Number: " + roll + "\n"
                            + "Course: " + course
            );
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistrationGUI();
    }
}