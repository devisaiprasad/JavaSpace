package ConstructorPackage;

public class Child extends Parent {
	
	public static void method1() {
		System.out.println("Child Static Method");
	}
	
	public void method2() {
		System.out.println("Child Instance Method");
	}

	public static void main(String[] args) {
		Child ch = new Child();
		
		ch.method2();
		ch.method1();
		

	}

}
