package map;


import java.util.Map;
import java.util.TreeMap;


// Maintain order based on Key
// It cannot have null key but can have multiple null
// if key is null then throws java.lang.NullPointerException at run time

public class TreeMapNullValues {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		   map.put(4,"Grapes");   
		   map.put(1,"Mango");    
		   map.put(2,"Apple");    
		   map.put(3,"Banana");  
		   map.putIfAbsent(5, "Kiwi"); 
		   map.put(7,null);  
		   //map.put(null,null);  
		   System.out.println("Iterating Hashmap...");  
		   
		   for(Map.Entry<Integer,String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}

}
