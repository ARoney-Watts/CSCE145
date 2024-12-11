//Ahmir Roney-Watts

import java.util.Scanner;

public class HealthDemo {

	public static void main(String[] args) {
		
		String decision = "unknown";
		
		do
		{	
			Scanner key = new Scanner(System.in);
		
			//Prompting the user for input
		
			System.out.println("Enter the name of the patient: \n");
		
			String name = key.nextLine();
			System.out.println();
		
			System.out.println("Enter the name of the health insurance provider: \n");
		
			String insurance = key.nextLine();
			System.out.println();
		
			//Listing the tests and their IDs
		
			System.out.println("ID  Name of Lab Test: \n");
		
			System.out.println("1   Xrays \n");
		
			System.out.println("2   Allergy Testing \n");
		
			System.out.println("3   Cholesterol \n");
		
			System.out.println("4   Vitamin D \n");
		
			System.out.println("5   Iron Profile \n");
		
			//Prompting the user for input on which tests they select.
		
			System.out.println("From the list above, select one or more lab tests. Enter the lab test ID and enter a negative number once done: \n");
		
			//creating variables for test choices and billing
			
			int testChoice = key.nextInt();
		
			int total = 0;
			
			//loop that allows user to select multiple tests
		
			while(testChoice > -1)
			{
				if(testChoice == 1)
				{
					total += 95;
						
					testChoice = key.nextInt();
				}
				else if(testChoice == 2)
				{
					total += 60;
				
					testChoice = key.nextInt();
				}
				else if(testChoice == 3)
				{
					total += 72;
				
					testChoice = key.nextInt();
				}
				else if(testChoice == 4)
				{
					total += 85;
				
					testChoice = key.nextInt();
				}
				else if(testChoice == 5)
				{
					total += 67;
		
					testChoice = key.nextInt();
				}
				else
				{
					System.out.println("Invalid ID entered!");
				}
			}
			
			System.out.println();
			
			/*
			 * using methods from the Patient class to calculate tax-included total as well as 
			copay amount and display the results in addition to the information obatined from
			the user, like name and provider
			 */
			
			Patient pt = new Patient();
			
			double taxedTotal = pt.calculateTaxes(total);
			
			double copay = pt.calculateCopayAmount(taxedTotal);
			
			pt = new Patient(name, insurance, total, taxedTotal, copay);
			
			pt.print();
			
			System.out.println();
			
			//prompting the user to either close the program or do input another patient's information
			
			System.out.println("Do you want to enter another patient's data? Enter \" yes\" or \"no\":");
			
			decision = key.next();
	
		}while(decision .equalsIgnoreCase("yes"));
		
		//exiting the program
		
		if(decision .equalsIgnoreCase("no"))
		{
			System.out.println("End of program!");
		}
	
	}

}
