package map;

import java.util.Hashtable;
import java.util.Map;

//A Hashtable is an array of list. Each list is known as a bucket. 
//The position of bucket is identified by calling the hashcode() method.

//if key/value is null then throws java.lang.NullPointerException at run time

public class HashtableNullValues {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi"); 
		  hm.put(104,"Devi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  //hm.put(105,null);  
		  
		  for(Map.Entry<Integer,String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}
