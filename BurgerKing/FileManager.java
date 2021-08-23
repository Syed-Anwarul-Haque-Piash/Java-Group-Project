
package BurgerKing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class FileManager {
    
    public ArrayList<Customer> allCustomer=new ArrayList<Customer>();
    
    public ArrayList<Customer> getAllCustomer()
    {
        
        FileInputStream fo=null;
        
        Customer c;
        String customerInfo="";
        
        
        try
        {
            fo=new FileInputStream("src/BurgerKing/customerInfo.txt");
            
            int a=fo.read();
            
            while(a!=-1)
            {
                if(a=='\r')
                {
                    c=new Customer(customerInfo);
                    allCustomer.add(c);
                    customerInfo="";
                    
                }
                else if(a=='\n')
                {
                    
                }
                else
                {
                    customerInfo+=(char)a;
                }
                
                a=fo.read();
            }
            
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        return allCustomer;
        
        
    }
    
    void writeNewUser()
    {
        FileOutputStream fo=null;
        
         try
        {
           fo=new FileOutputStream("src/BurgerKing/customerInfo.txt");
            
           for(Customer c: Manager.allCustomer)
            {
               String s=c.toText();
               System.out.println(s);
               
               byte [] b=s.getBytes();
               
               fo.write(b);
               fo.write('\r');
               fo.write('\n');
                
            } 
        
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
    
    
    
}
