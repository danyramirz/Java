import java.util.Scanner;

public class payroll {
	//private variables
	private int idNumber;
	private double payRate;
	private double hours;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		payroll person = new payroll();
		//employee imput
		System.out.println("Enter Employee ID");
		int idNum = keyboard.nextInt();
		person.setIdNumber(idNum);
		//employee hour rate
		System.out.println("Enter Houry rate");
		double pay = keyboard.nextDouble();
		person.setPayRate(pay);
		//imput hours
		System.out.println("Enter Hours");
		double hour = keyboard.nextDouble();
		person.setHours(hour);
		
		System.out.printf("ID Number: %d Hourly Rate: %.2f Hours %.2f Total pay: %,.2f", person.getIdNumber(), person.getPayRate(), person.getHours(), person.getPayRate() * person.getHours());
	}
		//getters and setters
	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public payroll() {
		// TODO Auto-generated constructor stub
	}

}
