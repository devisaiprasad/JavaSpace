package Staticpackage;

public class StaticExample {
	
	 static int count=0;//will get memory when instance is created

	public void increment(){
	count++;
	}

	public static void main(String[] args) {
		StaticExample c1=new StaticExample();
		StaticExample c2=new StaticExample();
		c1.increment();
		
		c2.increment();

		System.out.println(count);
		
		System.out.println(count);

	}

}
