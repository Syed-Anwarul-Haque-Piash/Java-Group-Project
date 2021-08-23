
package BurgerKing;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Manager {
    
    static ArrayList<Customer> allCustomer;
    
    Customer cus;
    
    public static void checkValid(String id,String pass)
    {
        int a=0;
        
        for(Customer c: allCustomer)
        {
            if(c.id.equals(id) && c.pass.equals(pass))
            {
             JOptionPane.showMessageDialog(null,"LogIn SuccessFul");
               
              Flame_Grilled_Burgers frame=new  Flame_Grilled_Burgers();
              frame.setVisible(true);
                
                a=1;
                break;
            }
        }
        
       if(a==0)
        {
            JOptionPane.showMessageDialog(null,"Invalid Customer");
        } 
        
    }
    
    
    
    
    
}
