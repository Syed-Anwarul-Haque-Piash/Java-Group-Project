
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
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Flame_Grilled_Burgers extends JFrame {
    
    private Container c;
    private Font f;
    private JButton bigking,whopper,doublewhopper,Total;
    private JLabel label,price1,price2,price3;
    private JTextArea ta;
    String amount="";
    
     String list="";
     int price=0;
     
    Flame_Grilled_Burgers()
    {
       super("FLAME-GRILLED BURGERS");
       this.setBounds(50, 10,960,800);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       addComponent();
       this.setVisible(true);
       
    }
    
   public void addComponent()
    {
        f=new Font("Times New Roman",Font.BOLD,18);
        c=this.getContentPane();
        c.setLayout(null);
        
        label=new JLabel("BURGER KING BANGLADESH");
        label.setBounds(50,90,280,200);
        label.setOpaque(true);
        label.setBackground(Color.ORANGE);
        label.setFont(f);
        c.add(label);
        
        bigking=new JButton("BIG KING");
        bigking.setBounds(10,400,460,40);
        bigking.setFont(f);
        c.add(bigking);
        
       
        
        
        price1=new JLabel("price : 200");
        price1.setBounds(490,360,100,100);
        price1.setFont(f);
        c.add(price1);
        
       whopper=new JButton("WHOPPER");
       whopper.setBounds(10,500,460,40);
        whopper.setFont(f);
        c.add(whopper);
        
        price2=new JLabel("price : 250");
        price2.setBounds(490,460,100,100);
        price2.setFont(f);
        c.add(price2);
        
        
       doublewhopper=new JButton("DOUBLE WHOPPER");
        doublewhopper.setBounds(10,580,460,40);
       doublewhopper.setFont(f);
        c.add(doublewhopper);
        
        price3=new JLabel("price : 300");
        price3.setBounds(490,560,100,100);
        price3.setFont(f);
        c.add(price3);
        
 
        
        ta=new JTextArea();
        ta.setBounds(500,90,650,200);
        ta.setFont(f);
        c.add(ta);
        
        Total=new JButton("Total :");
        Total.setBounds(15,630,460,40);
        Total.setFont(f);
        c.add(Total);
        
        
       
        
        
        ActionListener action=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               //  tf.setText("BIG KING");
                 ta.append("BIG KING \n");
              //   list+="BIG KING,";
                  price+=200;
              //  amount=""+price;
              //  ta.append("Amount \n"+amount+"\n");
              
              
              
            }
            
        };
        
        bigking.addActionListener(action);
        
        
        ActionListener reaction=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // tf.setText("WHOPPER");
                ta.append("WHOPPER\n");
                //  list+="WHOPPER,";
                 price+=250;
              //   amount=""+price;
               // ta.append("Amount \n"+amount+"\n");
            }
            
        };
        
        whopper.addActionListener(reaction);
        
        ActionListener listen=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // tf.setText("DOUBLE WHOPPER");
                ta.append("DOUBLE WHOPPER \n");
               //  list+="DOUBLE WHOPPER";
                   price+=300;
                //   String amount=""+price;
                 // ta.append("Amount \n"+amount+"\n");
                
                
            }
            
        };
        
        doublewhopper.addActionListener(listen);
        
        ActionListener taka=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                amount=""+price;
                
                ta.append("Price "+amount);
            }
            
        };
        
        Total.addActionListener(taka);
        
       // System.out.println(list);
       
        
        
      //  tf.setText(""+price);
        
          
        
    }
   
    
   /*
    public static void main(String[] args) {
        
        Flame_Grilled_Burgers frame=new Flame_Grilled_Burgers();
        //frame.setVisible(true);
       
        
        
        
    }
    
    */
}
