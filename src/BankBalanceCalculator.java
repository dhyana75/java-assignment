import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BankBalanceCalculator extends JFrame implements ActionListener {


    JLabel balanceLabel, transactionLabel, resultLabel;
    JTextField balanceField, transactionField;
    JButton depositButton, withdrawButton;


    BankBalanceCalculator() {


        // Create labels
        balanceLabel = new JLabel("Initial Balance:");
        transactionLabel = new JLabel("Transaction Amount:");
        resultLabel = new JLabel("Updated Balance: ");


        // Create text fields
        balanceField = new JTextField(10);
        transactionField = new JTextField(10);


        // Create buttons
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");


        // Add action listeners
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);


        // Set layout
        setLayout(new FlowLayout());


        // Add components
        add(balanceLabel);
        add(balanceField);


        add(transactionLabel);
        add(transactionField);


        add(depositButton);
        add(withdrawButton);


        add(resultLabel);


        // Frame properties
        setTitle("Bank Balance Calculator");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    // Handle button click
    @Override
    public void actionPerformed(ActionEvent e) {


        try {
            double balance = Double.parseDouble(balanceField.getText());
            double transaction = Double.parseDouble(transactionField.getText());


            if (e.getSource() == depositButton) {


                double updatedBalance = balance + transaction;


                resultLabel.setText(
                        "Updated Balance: " + updatedBalance
                );
            }


            if (e.getSource() == withdrawButton) {


                if (transaction <= balance) {


                    double updatedBalance = balance - transaction;


                    resultLabel.setText(
                            "Updated Balance: " + updatedBalance
                    );


                } else {
                    resultLabel.setText("Insufficient Balance!");
                }
            }


        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers!");
        }
    }


    public static void main(String[] args) {
        new BankBalanceCalculator();
    }
}
