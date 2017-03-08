import java.util.Scanner;
public class BankChargesLauncher {

	public static void main(String[] args) {
		int numChecks;
		double accountBalance;
		//scanner class imported
		Scanner keyboard = new Scanner(System.in);
		//user input data
		System.out.println("Enter the amount of checks written");
		numChecks = keyboard.nextInt();
		//user input account balance
		System.out.println("Enter the account balance");
		accountBalance = keyboard.nextDouble();
		BankCharges account1 = new BankCharges(numChecks, accountBalance);
		//user input number checks written
		System.out.println("Number of checks written: " + account1.getNumChecks());
		//user input account balance
		System.out.println("Account Balance: " + account1.getAccountTotal());
		//user input service fees
		System.out.println("Service fees for the month: " + account1.serviceFees());
		keyboard.close();
	}

}