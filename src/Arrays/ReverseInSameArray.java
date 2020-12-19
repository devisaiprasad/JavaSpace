package Arrays;

public class ReverseInSameArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		int n= arr.length;
		
		int temp, start=0,end =n-1;
		
		
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		
		
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		

	}

}
