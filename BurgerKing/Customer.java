
package BurgerKing;


public class Customer {
    
     String id;
    String pass;
    
    public Customer(String id,String pass)
    {
        this.id=id;
        this.pass=pass;
        System.out.println("Id : "+id);
        System.out.println("PassWord : "+pass);
    }
    
    public Customer(String info)
    {
        String [] stringArray=info.split("\\|");
        
        this.id=stringArray[0];
        this.pass=stringArray[1];
        
    }
    
     public String toText()
   {
       return id+'|'+pass;
   }
    
    
    
}
