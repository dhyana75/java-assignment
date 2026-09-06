import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleCalculator extends JFrame implements ActionListener {


    JLabel l1, l2, resultLabel;
    JTextField t1, t2;
    JButton addButton, subButton;


    SimpleCalculator() {


        // Create labels
        l1 = new JLabel("Enter First Number:");
        l2 = new JLabel("Enter Second Number:");
        resultLabel = new JLabel("Result: ");


        // Create text fields
        t1 = new JTextField(10);
        t2 = new JTextField(10);


        // Create buttons
        addButton = new JButton("Addition");
        subButton = new JButton("Subtraction");


        // Add action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);


        // Set layout
        setLayout(new FlowLayout());


        // Add components
        add(l1);
        add(t1);


        add(l2);
        add(t2);


        add(addButton);
        add(subButton);


        add(resultLabel);


        // Frame properties
        setTitle("Simple Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    // Handle button click
    @Override
    public void actionPerformed(ActionEvent e) {


        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());


            if (e.getSource() == addButton) {
                double result = num1 + num2;
                resultLabel.setText("Result: " + result);
            }


            if (e.getSource() == subButton) {
                double result = num1 - num2;
                resultLabel.setText("Result: " + result);
            }


        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers!");
        }
    }


    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
