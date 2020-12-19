package MethodOverriding;

//Can a constructor be overridden in java??

/*Constructor looks like method but it is not. It does not have a return type and its name is same as the class name.

A constructor cannot be overridden. If you try to write a super class’s constructor in the sub class compiler treats it as a method and expects a return type and generates a compile time error.
*/
public class ConstructorOverriding extends DemoTest{
	
	void DemoTest(){
	      System.out.println("This is the constructor of the demo class");
	   }

	public static void main(String[] args) {
		
	}

}
