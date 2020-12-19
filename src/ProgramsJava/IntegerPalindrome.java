package ProgramsJava;

public class IntegerPalindrome {
	
	public static void checkIntegerPalindrome(int n) {
		int r, temp, sum = 0;
		temp=n;

		while (n>0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n/10;
			
		}
		
		if(temp==sum) {
			System.out.println("Palindrome = "+ temp);
		}else {
			System.out.println("Not Palindrome = "+ temp);
		}

		
	}
	
	public static void checkArmstrong(int n) {
		int r, temp, sum = 0;
		temp=n;

		while (n>0) {
			r = n % 10;
			sum = sum + (r*r*r);
			n = n/10;
			
		}
		
		if(temp==sum) {
			System.out.println("Armstrong = "+ temp);
		}else {
			System.out.println("Not Armstrong = "+ temp);
		}

		
	}


	public static void main(String[] args) {
		
		checkIntegerPalindrome(454);
		checkArmstrong(153);
	}

}
