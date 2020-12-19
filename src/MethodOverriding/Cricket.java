package MethodOverriding;

public class Cricket extends Game {
	
	public void type()
 	{  
 		System.out.println("outdoor game"); 
	}
	
	public static void main(String[] args) {
		Game gm = new Game();
   		Cricket ck = new Cricket();
   		
   		gm.type();
   		ck.type();

   		Game gm1 = new Cricket();
   		gm1.type();

	}

}
