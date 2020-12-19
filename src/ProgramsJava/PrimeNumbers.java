package ProgramsJava;

public class PrimeNumbers {

	public static boolean CheckPrime(int n) {

		if (n > 1) {
			for (int i = 2; i <= n/2 ; i++) {
				if (n % i == 0) 
					return false;
			}
			return true;

		} else {
			return false;

		}

	}

	public static void printPrime(int max) {

		int i;
		boolean isPrime = true;

		for (i = 1; i <= max; i++) {
			isPrime = CheckPrime(i);
			if (isPrime) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		printPrime(100);

		System.out.println();
		System.out.println(CheckPrime(1));

	}

}
