package Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);

        System.out.println("Current Date and Time is: " + formatted);

	}

}
