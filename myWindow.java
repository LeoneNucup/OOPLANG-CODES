import javax.swing.*;
public class myWindow
{
    
    static JLabel label;
    public static void main(String[] args){
        JFrame window = new JFrame();
        //window.setSize(800,450);
        window.setBounds(600,225,400,400); // Horizontal Position,Vertical Position, Width, Height
        window.setTitle("My Window");
        window.setVisible(true);
        //window.setLocation(400,225);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel(); 
        label.setText("Hi");
        
    
    }
}


/* setDefaultCloseOperation()
   setBounds() - combination of setSize() and setLocation*/