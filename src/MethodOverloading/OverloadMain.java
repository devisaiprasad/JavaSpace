package MethodOverloading;

/*
 * Can we overload the main method in Java?
 * Yes,we can overload the main method in Java,but When we execute the
class JVM
starts execution with public static void main(String[] args) method.*/

public class OverloadMain {
	
	public static void main(int val) {
		System.out.println("Main 2");
	}

	public static void main(String[] args) {
		System.out.println("Main 1");
		OverloadMain.main(10);
	}
	
	

}
