package a1;

import java.util.Scanner;

public class A1Novice {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int items;
		
		// get total num of customers
		int numCust = scan.nextInt();
	
		for (int i = 0; i < numCust; i++) {
			
			// get name of customer
			String first = scan.next();
			String last = scan.next();
			
			// get customer's item count
			items = scan.nextInt();	
			
			// reset price count for each customer
			double custTotal = 0;
			
			for(int n = 0; n < items; n++) {
			
				int itemQuan = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				
				// calculate a running price
				custTotal = custTotal + itemQuan * price;
				
			}
			
			System.out.println(first.charAt(0) + ". " + last + ": " + custTotal);
		
		}
		
	}
	
}