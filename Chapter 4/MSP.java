import java.util.Scanner;


public class MSP {
	public static void main (String args[])
	{
		while (true)
		{
			printMonthlyBill(calculateBill(getHours(), menu()));
		}
	}	
	public static double getHours()
	{
		double hours;
		
		Scanner inputHours = new Scanner (System.in);
		
		System.out.print("Please enter the minutes used: ");
		hours = inputHours.nextDouble();
		
		inputHours.close();
		
		return hours;
	}
	public static int menu ()
	{
		int packageChoice;
		Scanner userInput = new Scanner (System.in);	
		System.out.println("[1] Package A");
		System.out.println("[2] Package B");
		System.out.println("[3] Package C");
		System.out.print("Please select your package: ");
		packageChoice = userInput.nextInt();
		userInput.close();
		return packageChoice;
	}
	public static double calculateBill(double hours, int packageChoice)
	{
		switch (packageChoice)
		{
			case 1:
				if (hours < 450)
				{
					return 39.99;
				}
				else
				{
					return (hours - 450)*0.45 + 39.99;
				}			
			case 2:
				if (hours < 900)
				{
					return 59.99;
				}
				else
				{
					return (hours - 900) + 59.99;
				}			
			case 3:
				return 69.99;
				
			default:
				System.out.println("Invalid input!");
				return 0;
		}
	}
	
	public static void printMonthlyBill(double bill)
	{	
		System.out.println("Your monthy bill is $" + bill);
	}
}