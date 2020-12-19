package Strings;

public class CharLength {
	
		

	public static void main(String[] args) {
		

		String str = "DeviSaiPrasad";
		int initLen = str.length();
		System.out.println("initLen - "+initLen);
		
		String str1 = str.replace("a", "");
		int finalLen = str1.length();
		System.out.println("finalLen - "+finalLen);
		
		System.out.println(initLen-finalLen);
		
		

	}

}
