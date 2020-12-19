package Staticpackage;
// we can overload static method
public class OverloadStaticMethod {
	
	public static void test() {
		System.out.println("static test function");
	}

	public static void test(int val) {
		System.out.println("static test function with parameter");
	}

	public static void main(String[] args) {
		OverloadStaticMethod.test();
		OverloadStaticMethod.test(10);

	}

}
