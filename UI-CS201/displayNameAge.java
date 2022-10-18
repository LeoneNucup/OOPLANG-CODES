import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class displayNameAge extends JFrame {
    JButton okButton = new JButton();
    JButton exitButton = new JButton();

    JTextField nameField = new JTextField();
    JTextField ageField = new JTextField();

    JLabel nameLabel = new JLabel();
    JLabel ageLabel = new JLabel();

    public displayNameAge() {
        setBounds(600, 400, 50, 50);
        setTitle("Display Name and Age");

        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();

        nameLabel.setText("Name");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        getContentPane().add(nameLabel, gridConstraints);

        ageLabel.setText("Age");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        getContentPane().add(ageLabel, gridConstraints);

        nameField.setText("");
        nameField.setColumns(10);
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        getContentPane().add(nameField, gridConstraints);

        ageField.setText("");
        ageField.setColumns(10);
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 1;
        getContentPane().add(ageField, gridConstraints);

        okButton.setText("OK");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 5;
        getContentPane().add(okButton, gridConstraints);

        exitButton.setText("EXIT");
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 5;
        getContentPane().add(exitButton, gridConstraints);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                okButtonPressed(e);

            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitButtonPressed(e);
            }
        });

        pack();
    }

    private void okButtonPressed(ActionEvent e) {
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,
                "Name is : " + nameField.getText() + ", and your Age is : " + ageField.getText());
        System.exit(0);
    }

    private void exitButtonPressed(ActionEvent e) {
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Thank You for Using this Program!");
        System.exit(0);

    }

    public static void main(String[] args) {
        new displayNameAge().show();

    }
}
