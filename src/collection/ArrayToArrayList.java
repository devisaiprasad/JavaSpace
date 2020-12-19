package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
	

		String[] citynames = { "Agra", "Mysore", "Chandigarh", "Bhopal" };
		
		ArrayList<String> slist= new ArrayList<String>(Arrays.asList(citynames));

		List<String> slist1= Arrays.asList(citynames);
		
		System.out.println("------------------------------");
		
		List<String> al = new ArrayList<String>(); 
		  
        // adding elements of array to arrayList. 
        Collections.addAll(al, citynames); 
  
        System.out.println(al); 
        
        
   

	}

}
