package Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	static void removeDuplicates(int[] array)
    {
     /*   System.out.println("Array With Duplicates : ");
         
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+"\t");
        }
         */
        Set<Integer> set = new LinkedHashSet<Integer>();      //Use HashSet if you don't want insertion order
         
        for(int i: array) 
        {
            set.add(i);
        }
        
        System.out.print(set);
        
    }

	public static void main(String[] args) {
		
		int[] arr = {22,11,35,87,22,32,11,50,45};
		removeDuplicates(arr);
		
		

	}

}
