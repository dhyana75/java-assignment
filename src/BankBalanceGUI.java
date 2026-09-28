import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankBalanceGUI extends JFrame implements ActionListener {

    JTextField balance, amount, result;
    JButton deposit, withdraw;

    BankBalanceGUI() {
        setTitle("Bank Balance Calculator");
        setSize(400, 300);
        setLayout(new FlowLayout());

        add(new JLabel("Initial Balance:"));
        balance = new JTextField(10);
        add(balance);

        add(new JLabel("Transaction Amount:"));
        amount = new JTextField(10);
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");

        add(deposit);
        add(withdraw);

        add(new JLabel("Updated Balance:"));
        result = new JTextField(10);
        result.setEditable(false);
        add(result);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double balanceAmount = Double.parseDouble(balance.getText());
        double transaction = Double.parseDouble(amount.getText());

        if (e.getSource() == deposit) {
            result.setText(String.valueOf(balanceAmount + transaction));
        }

        if (e.getSource() == withdraw) {
            result.setText(String.valueOf(balanceAmount - transaction));
        }
    }

    public static void main(String[] args) {
        new BankBalanceGUI();
    }
}