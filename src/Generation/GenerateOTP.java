package Generation;

import java.util.Random;

public class GenerateOTP {

	public static char[] OTP(int len) {
		System.out.println("Generating OTP using random() : ");
		System.out.print("You OTP is : ");

		// Using numeric values
		String numbers = "0123456789";

		// Using random class
		Random rndm_method = new Random();

		char[] ch = new char[len];

		for (int i = 0; i < len; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			ch[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		return ch;
	}

	public static void main(String[] args) {

		System.out.println(OTP(4));
	}

}
