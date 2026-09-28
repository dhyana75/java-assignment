import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton add, subtract;

    CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new FlowLayout());

        add(new JLabel("Enter first number:"));
        num1 = new JTextField(10);
        add(num1);

        add(new JLabel("Enter second number:"));
        num2 = new JTextField(10);
        add(num2);

        add = new JButton("Add");
        subtract = new JButton("Subtract");

        add(add);
        add(subtract);

        add(new JLabel("Result:"));
        result = new JTextField(10);
        result.setEditable(false);
        add(result);

        add.addActionListener(this);
        subtract.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());

        if (e.getSource() == add) {
            result.setText(String.valueOf(a + b));
        }

        if (e.getSource() == subtract) {
            result.setText(String.valueOf(a - b));
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}