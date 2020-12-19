package MethodOverloading;

/*Yes!Java supports constructor overloading.
In constructor loading,we create multiple constructors with the same name but with different parameters types or with different no of parameters.*/

public class ConstructorOverloading {
	 String message;
	
	public ConstructorOverloading(){
	      message = "Hello World!";
	   }
	   public ConstructorOverloading(String message){
	      this.message = message;
	   }

	public static void main(String[] args) {
		
		
		ConstructorOverloading tester = new ConstructorOverloading();
	      System.out.println(tester.message);
	   
	      ConstructorOverloading tester1 = new ConstructorOverloading("Welcome");
	      System.out.println(tester1.message); 

	}

}
