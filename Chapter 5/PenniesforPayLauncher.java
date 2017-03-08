import java.util.Scanner;
public class PenniesforPayLauncher {
	
	public static void main(String[] args) {
		int days;
		//scanner class
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have a salary of $0.01 and your Salary doubles every day bruh");
		System.out.println("Enter the amout of days Please: ");
		days = keyboard.nextInt();
		PenniesforPay person1 = new PenniesforPay(days);
		
		person1.salary();
		
		keyboard.close();
		
	}
}