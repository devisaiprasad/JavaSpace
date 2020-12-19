package ProgramsJava;

public class SumOfDigitsDivisibleByN {

	static int isSumDivides(int number) {
		int temp = number;

		int sum = 0,r;
		while(number != 0)
		{
			r = number % 10;
			sum = sum + r;
			number = number / 10;
		}
		//display sum of digits
		System.out.println("Sum of Digits = "+sum);


	

		if (temp % sum == 0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int N = 12;

		if (isSumDivides(N) == 1)
			System.out.print("YES");
		else
			System.out.print("NO");

	}

}
