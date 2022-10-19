import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame
{   JButton calculateButton = new JButton();
    JButton exitButton = new JButton();
    
    JLabel val1Label = new JLabel();
    JLabel operatorLabel = new JLabel();
    JLabel val2Label = new JLabel();
    JLabel resultLabel = new JLabel();
    JLabel blankLabel = new JLabel();
    
    JTextField val1Field = new JTextField();
    JTextField operatorField = new JTextField();
    JTextField val2Field = new JTextField();
    JTextField resultField = new JTextField();
    
    public Calculator(){
    setBounds(400,400,350,350);
    setTitle("Simple Calculator");
    
    getContentPane().setLayout(new GridBagLayout());
    GridBagConstraints gridlayout = new GridBagConstraints();
    
    val1Label.setText("  Operand 1 : ");
    gridlayout.gridx = 0;
    gridlayout.gridy = 0;
    getContentPane().add(val1Label,gridlayout);
    
    val1Field.setColumns(5);
    gridlayout.gridx = 2;
    gridlayout.gridy = 0;
    getContentPane().add(val1Field,gridlayout);
    
    operatorLabel.setText(" Operator : ");
    gridlayout.gridx = 0;
    gridlayout.gridy = 1;
    getContentPane().add(operatorLabel,gridlayout);
    
    operatorField.setColumns(5);
    gridlayout.gridx = 2;
    gridlayout.gridy = 1;
    getContentPane().add(operatorField,gridlayout);
    
    val2Label.setText("  Operand 2 : ");
    gridlayout.gridx = 0;
    gridlayout.gridy = 2;
    getContentPane().add(val2Label,gridlayout);
    
    val2Field.setColumns(5);
    gridlayout.gridx = 2;
    gridlayout.gridy = 2;
    getContentPane().add(val2Field,gridlayout);
    
    resultLabel.setText("Result : ");
    gridlayout.gridx = 0;
    gridlayout.gridy = 3;
    getContentPane().add(resultLabel,gridlayout);

    
    resultField.setText("");
    resultField.setColumns(5);
    gridlayout.gridx = 2;
    gridlayout.gridy = 3;
    getContentPane().add(resultField,gridlayout);
    
    calculateButton.setText("Calculate");
    gridlayout.gridx = 0;
    gridlayout.gridy = 5;
    getContentPane().add(calculateButton,gridlayout);
    
    exitButton.setText("Exit");
    gridlayout.gridx = 2;
    gridlayout.gridy = 5;
    getContentPane().add(exitButton,gridlayout);
    
    blankLabel.setText("");
    gridlayout.gridx = 1;
    gridlayout.gridy = 0;
    getContentPane().add(blankLabel,gridlayout);
    
    blankLabel.setText("");
    gridlayout.gridx = 1;
    gridlayout.gridy = 1;
    getContentPane().add(blankLabel,gridlayout);
    
    blankLabel.setText("                      ");
    gridlayout.gridx = 1;
    gridlayout.gridy = 2;
    getContentPane().add(blankLabel,gridlayout);
    
    blankLabel.setText("                      ");
    gridlayout.gridx = 1;
    gridlayout.gridy = 3;
    getContentPane().add(blankLabel,gridlayout);
    
    blankLabel.setText("                      ");
    gridlayout.gridx = 1;
    gridlayout.gridy = 5;
    getContentPane().add(blankLabel,gridlayout);
    
    blankLabel.setText("                      ");
    gridlayout.gridx = 0;
    gridlayout.gridy = 4;
    getContentPane().add(blankLabel,gridlayout);
    
    blankLabel.setText("                     ");
    gridlayout.gridx = 2;
    gridlayout.gridy = 4;
    getContentPane().add(blankLabel,gridlayout);
    
    
    
    calculateButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            compute(e);
        }
    });
    
    exitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            exit(e);
        }
    });
    
    
    }

    
    private void compute(ActionEvent e){
    double val1 = Integer.parseInt(val1Field.getText());
    double val2 = Integer.parseInt(val2Field.getText());
    double result;
    String val;
    if (operatorField.getText().equals("+")){
        result = val1+val2;
        resultField.setText(""+result);}
        
    else if (operatorField.getText().equals("-")){
        result = val1-val2;
        resultField.setText(""+result);}
        
    else if (operatorField.getText().equals("*")){
        result = val1*val2;
        resultField.setText(""+result);}
        
    else if (operatorField.getText().equals("/")){
        result = val1/val2;
        resultField.setText(""+result);}

    }
    
    private void exit(ActionEvent e){
    JFrame frame = new JFrame();
    JOptionPane.showMessageDialog(frame,"This Program will now terminate");
    System.exit(0);
    }
    
    
    public static void main(String[] args){
        new Calculator().show();
    
    
    }
}
