package ProgramsJava;

public class VowelsConsonantsCount {

	public static void count(String str) {
		int vowels = 0, Consonants = 0;

		// converting all the chars to lowercase
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				Consonants++;
			}
		}
		System.out.println("Number of Vowels: " + vowels);
		System.out.println("Number of Consonants: " + Consonants);
	}

	public static void main(String[] args) {
		String val = "BeginnersBook";
		VowelsConsonantsCount.count(val);

	}

}
