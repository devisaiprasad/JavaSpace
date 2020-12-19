package AbstractPackage;

public class TimesWhat extends Product {

	public TimesWhat(int what) {
		super(what);
		
	}
	
	public static void main(String[] args) {

		TimesWhat b = new TimesWhat(10);
		//b.multiplyBy = 20;
		int val = b.mutiply(10);
		System.out.println("val = "+val);
		
		

	}

	@Override
	void fun() {
		// TODO Auto-generated method stub
		
	}

}
