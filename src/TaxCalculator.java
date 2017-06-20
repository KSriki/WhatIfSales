import java.util.Scanner;

/*
 * Simple Tax Calculator
 * Srikant Kumar Kalaputapu
 */

public class TaxCalculator {
	public static void main(String[] args){
		
		int id;
		String name,tCode;
		Scanner keyboard = new Scanner(System.in);
		double sales, total, tax = 1;
		
	
		
		System.out.println("Enter customer number: ");
		id = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter customer name: ");
		name = keyboard.nextLine();
		System.out.println("Enter the sales amount: ");
		sales = keyboard.nextDouble();
		System.out.println("Enter the Tax Code: ");
		tCode = keyboard.next();
		
		System.out.println("Customer ID: " + id);
		System.out.println("Customer Name: " + name);
		System.out.printf("Sales Amount: $%.2f\n",sales);
		System.out.println("Tax Code: " + tCode);
		
		if(tCode.equals("NRM")){
			tax = 1.06;
		}
		else if (tCode.equals("NPF")) {
			tax = 1;
		}
		else if(tCode.equals("BIZ")){
			tax = 1.045;
		}
		
		
		if(tax != 1){
			System.out.printf("Tax owed: $%.2f\n",((tax - 1)*sales));
			
		}
		
		System.out.printf("Total Amount Due: $%.2f\n",(tax * sales) );
		
	}
}
