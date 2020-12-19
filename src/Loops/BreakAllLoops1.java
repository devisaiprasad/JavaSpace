package Loops;

public class BreakAllLoops1 {

	public static void main(String[] args) {
		
			
			for (int i = 1; i < 6; i++) {
				System.out.println("A");
				for (int k = 1; k < 6; k++) {
					System.out.println("B");
					for (int j = 1; j < 6; j++) {
						
						if (j == 3)
							System.out.println(j);
							return;
					}
				}
			}
			
		
			
			
			
			
			  System.out.println("------------------------------");
			  
			  for (int i = 1; i < 6; i++) { 
				  System.out.println("A"); 
				  for (int k = 1; k < 6;k++) { 
					  System.out.println("B"); 
					  for (int j = 1; j < 6; j++) {
			  
						  if (j == 3) 
							  System.out.println(j); 
						  		i=6; 
						  		k=6; 
						  		break; 
						  		} 
					  } 
				  }
			 
			
			
			
	}

}
