package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
	// java.util.Arrays class  -> sort() method
	public static void main(String[] args) {
		 
		
		
		
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
		  
	    Arrays.sort(arr); 
	  
	    System.out.println("Sorted Int Array : "+ Arrays.toString(arr)); 
	    
	 // Sorts arr[] in descending order 
	    Integer[] arrRev = {13, 7, 6, 45, 21, 9, 2, 100}; 
        Arrays.sort(arrRev, Collections.reverseOrder()); 
  
        System.out.println("Reverse Sorted Int Array : "+ Arrays.toString(arrRev)); 
        
        
        //defining an array of type String  
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
	    
        Arrays.sort(countries);  
      //prints the sorted string array in ascending order  
      System.out.println(Arrays.toString(countries));  
      
      
      
    //sorts array in descending order  
      Arrays.sort(countries, Collections.reverseOrder());   
      //prints the sorted string array in descending order  
      System.out.println(Arrays.toString(countries));  

	}

}
