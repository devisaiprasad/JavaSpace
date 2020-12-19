package ProgramsJava;

public class SumOfDigits {
	
	public static void print(int number) {
		int sum = 0,r;
		while(number != 0)
		{
			r = number % 10;
			sum = sum + r;
			number = number / 10;
		}
		//display sum of digits
		System.out.print("Sum of Digits = "+sum);
	}

	public static void main(String[] args) {
		SumOfDigits.print(123);
	}

}
