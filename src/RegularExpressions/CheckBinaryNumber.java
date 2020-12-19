package RegularExpressions;

public class CheckBinaryNumber {

	public static boolean isBinaryNumber(int num) {

		// Regex to check a number
		// is binary or not
		String regex = "[01][01]+";

		// Match the given number with the regular expression
		return String.valueOf(num).matches(regex);
	}

	public static void main(String[] args) {
		int N = 10; 
        System.out.println(isBinaryNumber(N)); 

	}

}
