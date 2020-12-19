package ProgramsJava;

public class DivisibleByXbutNotByY {

	static int countNumbers(int X, int Y, int N) {
		int count = 0;
		for (int i = 1; i <= N; i++) {
			// Check if Number is divisible
			// by x but not Y
			// if yes, Increment count
			if ((i % X == 0) && (i % Y != 0)) {
				count++;
				System.out.println(i);
				
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int X = 2, Y = 3, N = 10;
		System.out.println(countNumbers(X, Y, N));

	}

}
