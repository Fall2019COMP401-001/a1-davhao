package a1;

import java.util.Scanner;

public class A1Adept {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {	

			int itemCount = scan.nextInt();
			
			// create array to sort data
			
			String[] names = new String[itemCount];
			double[] prices = new double[itemCount];
			
			// collect info about each item
			
			for (int i = 0; i < itemCount; i++) {
				
				names[i] = scan.next();
				prices[i] = scan.nextDouble();
				
			}
			
			// get total num of customers
			int numCust = scan.nextInt();
			
			// create array for customer name
			String[] custName = new String[numCust];
			
			// create parallel array for customer totals
			double[] custTotal = new double[numCust];
			
			for (int i = 0; i < numCust; i++) {
				
				// get name of customer
				String first = scan.next();
				String last = scan.next();
				custName[i] = first + " " + last;
				
				// get customer's item count and name
				int items = scan.nextInt();	
				
				// make arrays for individual customer
				String[] indItems = new String[items];
				int[] count = new int[items];					
				
				// scan through each items and get quantities
				for (int n = 0; n < items; n++) {
				
					count[n] = scan.nextInt();				
					indItems[n] = scan.next();
					
				}
				
				// match customer item to item list array and then to item price array
				for (int m = 0; m < items; m++) {
					
					for (int x = 0; x < itemCount; x++) {
						//if customer has that item, then add price of item to total
						if (indItems[m].equals(names[x])) {
								
							double total = prices[x] * count[m]; 
							custTotal[i] = custTotal[i] + total;
								
						}	
		
					}
					
				}			
	
			}
			
			double bigSpent = 0;
			String bigName = null;
			double smSpent = custTotal[0];
			String smName = null;
			double tot = 0;

			for (int k = 0; k < custTotal.length; k++) {
				
				if (custTotal[k] > bigSpent) {
					
					bigSpent = custTotal[k];
					bigName = custName[k]; 
					
				}
				
				if (custTotal[k] < smSpent) {
					
					smSpent = custTotal[k];
					smName = custName[k];
					
				}
				
				tot = tot + custTotal[k]; 
				
			}
			
			double avg = tot/numCust;
			
			System.out.println("Biggest: " + bigName + " " + "(" + String.format ("%.2f", bigSpent) + ")");
			System.out.println("Smallest: " + smName + " " + "(" + String.format ("%.2f", smSpent) + ")");
			System.out.println("Average: " + String.format ("%.2f", avg));
	}
}