
package BurgerKing;


public class Main {
    
    public static void main(String[] args) {
        
        FileManager fm=new FileManager();
        
        Manager.allCustomer=fm.getAllCustomer();
        
        LogInFrame  frame=new LogInFrame ();
        frame.setVisible(true);
        
        
        
    }
   
    
}
