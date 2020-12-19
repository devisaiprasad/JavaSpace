package ProgramsJava;

//A and B are two numbers which define a range,where A<=B.Find the total numbers in the given range[A…B]divisible by'M'
public class NumberDivisibleInRange {

	static int countDivisibles(int A, int B, int M) {
		// Variable to store the counter
		int counter = 0;

		// Running a loop from A to B and check
		// if a number is divisible by M.
		for (int i = A; i <= B; i++)
			if (i % M == 0)
				counter++;

		return counter;
	}

	public static void main(String[] args) {
		// A and B define the range, M is the dividend
		int A = 30, B = 100, M = 30;

		// Printing the result
		System.out.println(countDivisibles(A, B, M));
	}

}
