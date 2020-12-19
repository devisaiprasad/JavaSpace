package InterfacePackage;

public class D implements C{

	@Override
	public void test() {
		System.out.println("Testing");
		
	}

	@Override
	public void test1() {
		System.out.println("Testing1");
		
	}

	@Override
	public void test2() {
		System.out.println("Testing2");
		
	}

	@Override
	public void test3() {
		System.out.println("Testing3");
		
	}
	
	
	public static void main(String[] args) {
		D d=new D();
		d.test();
		d.test1();
		d.test2();
		d.test3();

	}


}
