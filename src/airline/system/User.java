/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.system;

/**
 *
 * @author sharayu
 */
class User {
    
  
     private String fromp; 
          private String top;
                private String dof;
      private String   Timing ;
        private String class1 ; 
       private int amount;
    
    public User(String fromp,String top, String dof, String Timing, String class1, int amount)
    {
       
    this.fromp=fromp;
    this.top=top;
    this.dof=dof;
    this.Timing=Timing;
    this.class1=class1;
    this.amount=amount;
    }
    
    public String getfromp()
    {
    return fromp;
    }
    
    public String top()
    {
    return top;
    }
    
    public String dof()
    {
    return dof;
    }
    
    public String Timing()
    {
    return Timing;
    }
    
    public String class1()
    {
    return class1;
    }
    public int amount(){
    return amount;
    }
    
}
