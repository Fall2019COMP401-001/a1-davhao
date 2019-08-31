package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int itemCount = scan.nextInt();
		
		// create array to sort data
		
		String[] names = new String[itemCount];
		double[] prices = new double[itemCount];
		int[] numCB = new int[itemCount];
		
		// collect info about each item
		
		for (int i = 0; i < itemCount; i++) {
			
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		
		// get total num of customers
		int numCust = scan.nextInt();
		
		// create array for customer name
		String[] custName = new String[numCust];		
		
		// now create a new array to store a running quantity of each of the products
		int[] quantity = new int[itemCount];
		
		// for each customer...
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

				// arrays for customer name (custName), 
				// products they bought (indItems), 
				// and quantities of those products (count), have been made
				
				// look for which items customers bought and add to running quantity array
				
			}
			
			for (int x = 0; x < itemCount; x ++) {		
				
				boolean added = false;
				
				for (int m = 0; m < items; m++) {			
					
					// if customer has item, add to customer count
					if (indItems[m].equals(names[x])) {
					
						// add in function to update quantity array!
					quantity[x] = quantity[x] + count[m];	
					
					}
					
					if (names[x].equals(indItems[m]) && added == false) {
					
					// add in function to update numCB array!
					numCB[x]++;
					added = true;
									
					}
			
				}
					
			}				
				
		}
		
		for (int x = 0; x < itemCount; x ++) {
			
			if (numCB[x] > 0) {
			
			System.out.println(numCB[x] + " customers bought " + quantity[x] + " " + names[x]);
				
			}
			
			else System.out.println("No customers bought " + names[x]);
			
		}	
		
	}
	
}