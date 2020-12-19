package RegularExpressions;

public class PhoneNumber {
	
	public static void validate(String str) {
	      
	      System.out.println("The phone number is: " + str);
	      
	      String regex = "[7-9][0-9]{9}";
	      
	      System.out.println("Is the above phone number valid? " + str.matches(regex));
	   }

	public static void main(String[] args) {
		String phone = "9999999998";
		String phone1 = "8999999998";
		String phone2 = "7999999998";
		String phone3 = "6999999998";
		
		
		validate(phone);
		validate(phone1);
		validate(phone2);
		validate(phone3);
		

	}

}
