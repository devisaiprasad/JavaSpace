package InterfacePackage;

public class OverloadingInterfaces implements MyInterface{

	@Override
	public void display() {
		System.out.println("This is display method");
		
	}

	@Override
	public void display(String name, int age) {
		System.out.println("Name: "+name);
	    System.out.println("Age: "+age);
		
	}
	
	public static void main(String[] args) {
		OverloadingInterfaces obj = new OverloadingInterfaces();
	      obj.display();
	      obj.display("krsna", 11);

	}

}
