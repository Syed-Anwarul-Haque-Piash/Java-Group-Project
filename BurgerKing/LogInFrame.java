
package BurgerKing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInFrame  extends JFrame {
    
   private Container c; 
   private JLabel idLabel,passLabel;
   private JTextField idField;
   private JPasswordField passField;
   private JButton logIn;
    private Font f;
   public LogInFrame()
    {
        super("Burger King Bangladesh");
       // this.setBounds(50,100,800,700);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponent();
        
    }
   
   
   public void addComponent()
   {
       f=new Font("Arial",Font.BOLD,18);
       c=this.getContentPane();
       c.setBackground(Color.WHITE);
       c.setLayout(null);
       
       idLabel=new JLabel("Customer ID :");
       idLabel.setBounds(20,30,200,100);
       idLabel.setFont(f);
       c.add(idLabel);
       
       idField=new JTextField();
       idField.setBounds(180,63,100,30);
       idField.setFont(f);
       c.add(idField);
       
       
       
       passLabel=new JLabel("PassWord :");
       passLabel.setBounds(20,130,200,100);
       passLabel.setFont(f);
       c.add(passLabel);
       
       passField=new JPasswordField();
       passField.setBounds(180,162,100,30);
       c.add(passField);
       
       logIn=new JButton("LogIn");
       logIn.setBounds(20,260,100,30);
       logIn.setFont(f);
       c.add(logIn);
       
       ActionListener action=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
              //  System.out.println("Button Pressed");
                
               String id=idField.getText();
               String pass=passField.getText();
               
              //  System.out.println("LogIn ID : "+id);
               // System.out.println("PassWord : "+pass);
                
     
          
         
             
             if(id.trim().length()>0 && pass.trim().length()>0 )
             {
                 Manager.checkValid(id,pass); 
             }
             else
             {
                // System.out.println("Please provide id , password and type");
                JOptionPane.showMessageDialog(null,"Please provide id , password");
             }
             
            } };
            
       
       
       
       logIn.addActionListener(action);
       
       
       
       
       
       
      }
   
     
   
   
    
   
    
}
