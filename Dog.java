
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dog extends JFrame
{
    static JButton OkButton = new JButton();
    static JButton ExitButton = new JButton();
    
    static JLabel BreedLabel = new JLabel();
    static JLabel TagLabel = new JLabel();
    static JLabel ColorLabel = new JLabel();
    
    static JTextField BreedField = new JTextField();
    static JTextField TagField = new JTextField();
    static JTextField ColorField = new JTextField();
    
    public void layout(){
        setBounds(400,400,400,400);
        setTitle("Dog");
        
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridlayout = new GridBagConstraints();
        
        OkButton.setText("OK");
        gridlayout.gridx = 0;
        gridlayout.gridy = 4;
        getContentPane().add(OkButton,gridlayout);
        
        ExitButton.setText("Exit");
        gridlayout.gridx = 2;
        gridlayout.gridy = 4;
        getContentPane().add(ExitButton,gridlayout);
        
        BreedLabel.setText("Breed : ");
        gridlayout.gridx= 0;
        gridlayout.gridy=0;
        getContentPane().add(BreedLabel,gridlayout);
        
        BreedField.setColumns(5);
        gridlayout.gridx= 2;
        gridlayout.gridy=0;
        getContentPane().add(BreedField,gridlayout);
        
        TagLabel.setText("Tag Number : ");
        gridlayout.gridx= 0;
        gridlayout.gridy=1;
        getContentPane().add(TagLabel,gridlayout);
        
        TagField.setColumns(5);
        gridlayout.gridx= 2;
        gridlayout.gridy=1;
        getContentPane().add(TagField,gridlayout);
        
        ColorLabel.setText("Color : ");
        gridlayout.gridx= 0;
        gridlayout.gridy=2;
        getContentPane().add(ColorLabel,gridlayout);
        
        ColorField.setColumns(5);
        gridlayout.gridx= 2;
        gridlayout.gridy=2;
        getContentPane().add(ColorField,gridlayout);
        
        OkButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                printInfo(e);
        }
        });
        
        ExitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                exit(e);
        }
        });
    }
    
     
     private void printInfo(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Your Dog's Breed is "+ BreedField.getText()+"\n\nYour Dog's Tag Number is " + TagField.getText()+"\n\nYour Dog's Color is " + ColorField.getText(),"Dog Information",JOptionPane.INFORMATION_MESSAGE);
            
        }   
    private void exit(ActionEvent e){
            
            JOptionPane.showMessageDialog(null,"Thank You for using this Program!","Exit",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
    
    }
        
        
     public static void main(String[] args){
        layout();
        }
}
