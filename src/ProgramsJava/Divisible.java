package ProgramsJava;
//print ! if it is divisible by 2, print @ if it is divisible by 3 and print % if it is both divisible by 2 and 3
public class Divisible {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i+ " #");
				
			}else if(i % 2 == 0){
				System.out.println(i+ " !");
			}else if(i % 3 == 0){
				System.out.println(i+ " @");
			}

	}

}
	
}
