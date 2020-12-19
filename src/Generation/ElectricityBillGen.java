package Generation;

/*1 to 100 units � Rs. 10/unit
100 to 200 units � Rs. 15/unit
200 to 300 units � Rs. 20/unit
above 300 units � Rs. 25/unit*/

public class ElectricityBillGen{

	public static int calculateBill(int units) {

		// Condition to find the charges
		// bar in which the units consumed
		// is fall
		if (units <= 100) {
			return units * 10;
		} else if (units <= 200) {
			return (100 * 10) + (units - 100) * 15;
		} else if (units <= 300) {
			return (100 * 10) + (100 * 15) + (units - 200) * 20;
		} else if (units > 300) {
			return (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
		}
		return 0;
	}
	

	public static void main(String[] args) {
		
		System.out.println(calculateBill(150));

	}

}
