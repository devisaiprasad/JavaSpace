package ProgramsJava;

public class Divisible2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {

			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println(i + " Apple and Orange");
			else if (i % 3 == 0)
				System.out.println(i + " Apple");
			else if (i % 5 == 0)
				System.out.println(i + " Orange");

		}

	}

}
