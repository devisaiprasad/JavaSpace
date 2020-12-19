package ProgramsJava;

public class DecimalToBinaryNumber {
	
	public static String calculateBinary(int number,int base){
	    StringBuffer sb = new StringBuffer();
	    int rem=0;
	    
	    while(number>0){
	        rem = number%base;
	        sb.append(rem);
	        number = number / base;
	    }
	    
	    return sb.reverse().toString();
	}
	

	public static void main(String[] args) {

		String val = calculateBinary(75,2);
		
		System.out.println(val);

			int i = Integer.parseInt(val);
			
			System.out.println(i);
			
			
			
			
	}

}
