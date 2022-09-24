import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Stopwatch extends JFrame
{
    JButton startButton = new JButton();
    JButton stopButton = new JButton();
    JButton exitButton = new JButton();
    
    JLabel startLabel = new JLabel();
    JLabel stopLabel = new JLabel();
    JLabel elapsedLabel = new JLabel();
    
    JTextField startTextField = new JTextField();
    JTextField stopTextField = new JTextField();
    JTextField elapsedTextField = new JTextField();
    
    long startTime;
    long stopTime;
    double elapsedTime;
    
    private void exitForm(WindowEvent e){
            JFrame f;
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"Exiting Module");
        }
        
    private void startButtonActionPerformed(ActionEvent e){
            JFrame f;
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"Start Timer Initiated");
            
    }
    
    private void stopButtonActionPerformed(ActionEvent e){
            JFrame f;
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"Stop Timer Initiated");
            
    }
    
    private void exitButtonActionPerformed(ActionEvent e){
            JFrame f;
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"THANK YOU!! <3 <3");
            System.exit(0);
            
    }
    
    public Stopwatch(){
        setBounds(600,400,50,50);
        setTitle("Stopwatch Application");   
                
        //Grid Creation
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        
        //Button
        startButton.setText("Start Timer");
        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        getContentPane().add(startButton,gridConstraints);
        
        stopButton.setText("Stop Timer");
        gridConstraints.gridx=0;
        gridConstraints.gridy=1;
        getContentPane().add(stopButton,gridConstraints);
        
        exitButton.setText("Exit Timer");
        gridConstraints.gridx=0;
        gridConstraints.gridy=2;
        getContentPane().add(exitButton,gridConstraints);
        //Label
        startLabel.setText("Start Time");
        gridConstraints.gridx=1;
        gridConstraints.gridy=0;
        getContentPane().add(startLabel,gridConstraints);
        
        stopLabel.setText("Stop Time");
        gridConstraints.gridx=1;
        gridConstraints.gridy=1;
        getContentPane().add(stopLabel,gridConstraints);
        
        elapsedLabel.setText("Elapsed Time (sec) ");
        gridConstraints.gridx=1;
        gridConstraints.gridy=2;
        getContentPane().add(elapsedLabel,gridConstraints);
        //TextField
        startTextField.setText("");
        startTextField.setColumns(15);
        gridConstraints.gridx=2;
        gridConstraints.gridy=0;
        getContentPane().add(startTextField,gridConstraints);
        
        stopTextField.setText("");
        stopTextField.setColumns(15);
        gridConstraints.gridx=2;
        gridConstraints.gridy=1;
        getContentPane().add(stopTextField,gridConstraints);
        
        elapsedTextField.setText("");
        elapsedTextField.setColumns(15);
        gridConstraints.gridx=2;
        gridConstraints.gridy=2;
        getContentPane().add(elapsedTextField,gridConstraints);
        
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                exitForm(e);
                }
            }); 
            
            
            
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                startButtonActionPerformed(e);
            }
        });
        
        
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                stopButtonActionPerformed(e);
            }
        });
        
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                exitButtonActionPerformed(e);
            }
        });
        
        
        pack();
        
        

    }
    
    
    
    public static void main(String[] args){
        new Stopwatch().show();
    
    
    
    }
}
