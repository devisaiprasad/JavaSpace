package ProgramsJava;

public class Fibonacci {

	public static void printFibonacci(int num) {
		int n1 = 0, n2 = 1, sum = 0;

		System.out.print(n1 + " " + n2);

		for (int i = 2; i < num; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}
	
	
	public static void main(String[] args) {
	
		printFibonacci(10);
		
		
	}

}
