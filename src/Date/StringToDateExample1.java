package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringToDateExample1 {

	public static void main(String[] args) throws Exception {

		String sDate1 = "31/12/1998";

		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = formatter1.parse(sDate1);
		System.out.println(sDate1 + "\t" + date1);
		
		System.out.println("------------------------------");
		
		
		String start_dt = "2011-01-31";

		DateFormat parser = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = (Date) parser.parse(start_dt);

		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
		System.out.println(formatter.format(date));

		
		

	}

}
