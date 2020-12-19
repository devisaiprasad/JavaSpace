package ProgramsJava;

public class PrimeNumbersInterval {

	public static void print(int a, int b) {
		int i, j, count;
		for (i = a; i <= b; i++) {

			// logic for checking number is prime or not
			count = 0;
			for ( j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.print(i+" ");
		}

	}

	public static void main(String[] args) {

		PrimeNumbersInterval.print(4, 20);

	}

}
