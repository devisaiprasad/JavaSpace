package Staticpackage;

public class OverrideStaticMethod extends Base{
	
	// This method hides display() in Base  
    public static void display() { 
         System.out.println("Static method from Derived"); 
    } 
      
    // This method overrides print() in Base  
    public void print() { 
         System.out.println("Non-static or Instance method from Derived"); 
   } 

	public static void main(String[] args) {
		
		Base obj1 = new OverrideStaticMethod(); 
        
	       // As per overriding rules this should call to sub class static overridden method. 
			// Since static method can not be overridden, it calls Base's display()  
	       obj1.display();   
	         
	       // Here overriding works and Derive's print() is called  
	       obj1.print();  
	       
	       
	       OverrideStaticMethod obj2 = new OverrideStaticMethod();
	       obj2.display();
	       obj2.print(); 

	}

}
