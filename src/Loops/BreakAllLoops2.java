package Loops;

public class BreakAllLoops2 {

	public static void main(String[] args) {
		
		boolean finished = false;
		for (int i = 1; i < 6 && !finished; i++) {
			System.out.println("A");
			for (int k = 1; k < 6 && !finished; k++) {
				System.out.println("B");
				for (int j = 1; j < 6 && !finished; j++) {
					
					if (j == 3)
						System.out.println(j);
						finished = true;
						
						
				}
			}
		}

	}

}
