import java.util.Scanner;
//public method
public class num2Launcher {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
num2ShiftSupervisor p1 = new num2ShiftSupervisor();
System.out.print("Enter the Employee Name: ");//user input
String name = keyboard.nextLine();
System.out.print("Enter the employee ID: ");//user input
String id = keyboard.nextLine();
System.out.print("Enter the Hire Date for "+ name +": ");//user input
String date = keyboard.nextLine();
System.out.print("Enter Shift supervisor Sallary: ");//user input
double sall = keyboard.nextDouble();
System.out.print("Emter the supervisor's bonus: ");//user input
double bonus = keyboard.nextDouble();
p1.setName(name);
p1.setEmpNum(id);
p1.setHireDate(date);
p1.setSalary(sall);
p1.setProduction(bonus);
System.out.println("Name: " + p1.getName());
System.out.println("Employee Id: " + p1.getEmpNum());
System.out.println("Hire Date: " + p1.getHireDate());
System.out.println("Salary: $" + p1.getSalary());
System.out.println("Production bonus: $" + p1.getProduction());
	}
}