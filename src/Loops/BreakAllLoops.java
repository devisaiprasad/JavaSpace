package Loops;

public class BreakAllLoops {

	public static void main(String[] args) {
		
		
		outer: 
		for (int i = 1; i < 6; i++) {
			System.out.println("A");
			for (int k = 1; k < 6; k++) {
				System.out.println("B");
				for (int j = 1; j < 5; j++) {
					System.out.println(j);
					if (j == 3)
						break outer;
				}
			}
		}

	}

}
