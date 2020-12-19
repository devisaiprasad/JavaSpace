package ConstructorPackage;

public class SingleTonClass {

	private static SingleTonClass obj = null;
	public int x = 10; 

	private SingleTonClass() {
		/*
		 * Private Constructor will prevent the instantiation of this class directly
		 */
	}

	public static SingleTonClass objectCreationMethod() {
		/*
		 * This logic will ensure that no more than one object can be created at a time
		 */
		if (obj == null) {
			obj = new SingleTonClass();
		}
		return obj;
	}

	public void display() {
		System.out.println("Singleton class Example");
	}

	public static void main(String[] args) {
		
		
		SingleTonClass a = SingleTonClass.objectCreationMethod(); 
		SingleTonClass b = SingleTonClass.objectCreationMethod(); 
	       a.x = a.x + 10; 
	       System.out.println("Value of a.x = " + a.x); 
	       System.out.println("Value of b.x = " + b.x); 
		
		
	
		

	}

}
