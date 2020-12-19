package ProgramsJava;

public class PerfectNumber {

	public static boolean isPerfectNumber(int n) {

		int temp = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				temp += i;
			}
		}
		if (temp == n) {
			System.out.println("It is a perfect number");
			return true;
		} else {
			System.out.println("It is not a perfect number");
			return false;
		}
	}

	public static void main(String[] args) {

		isPerfectNumber(6);
	}

}
