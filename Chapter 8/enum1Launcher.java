import java.util.Scanner;

public class enum1Launcher {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	num1Product p1 = new num1Product();
	
	System.out.print("Enter your mutha ducking Name: ");
	String name = keyboard.nextLine();
	System.out.print("What's your employee ID: ");
	String ID = keyboard.nextLine();
	System.out.print("What is your hire data:  " + name +": ");
	String date = keyboard.nextLine();
	System.out.print("Enter the shift: 1 for day,"
			+ "2 for night: " );
	
	int shift = keyboard.nextInt();
	System.out.print("enter hourly rate");
	double rate = keyboard.nextDouble();
	
	p1.setName(name);
	p1.setEmpNum(ID);
	p1.setHireDate(date);
	p1.setShift(shift);
	p1.setHourRate(rate);
	
	
	System.out.println("Name: " + p1.getName());
	System.out.println("Employee ID: " + p1.getEmpNum());
	System.out.println("Hire Date: " + p1.getHireDate());
	if(p1.getShift() == 1){
		System.out.println("Shift: Day");
	} else {
		System.out.println("Shift: Night");
	}
	System.out.println("Pay Rate: " + p1.getHourRate());
		
	}

}
