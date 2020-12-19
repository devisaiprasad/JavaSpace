package ProgramsJava;

public class CheckBinaryNumber {

	public static boolean isBinaryNumber(int num) {

		// is either 0 or 1 or a negative number
		if ( num <= 1) {
			return false;
		}

		// Get the rightmost digit of the number with the help of remainder '%' operator
		// by dividing it with 10
	
		while (num != 0) {

			// If the digit is greater than 1 return false
			if (num % 10 > 1) {
				System.out.println(num % 10);
				return false;
			}
			num = num / 10;
		}
		return true;
	}

	public static void main(String[] args) {

		int N = 1101;

		// Function Call
		System.out.println(isBinaryNumber(N));

	}

}
