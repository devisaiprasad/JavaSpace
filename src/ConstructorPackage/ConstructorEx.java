package ConstructorPackage;

public class ConstructorEx {
	
	int id;  
    String name;
	
	/*
	 * ConstructorEx(){ System.out.println("Default Constructor"); }
	 */

	
    ConstructorEx(int i,String n){  
        id = i;  
        name = n;  
        }  
    
    void display(){
    	System.out.println(id+" "+name);
    	}
    
	public static void main(String[] args) {
		
		ConstructorEx c1 = new ConstructorEx(1,"dsp");
		ConstructorEx c2 = new ConstructorEx(2,"krish");
		
		c1.display();
		c2.display();

	}

}
