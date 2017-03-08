import java.util.Scanner;

public class num3Launcher {

public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
num3Team p1 = new num3Team();		
System.out.print("Enter the Employee Name: ");//user input
String name = keyboard.nextLine();
System.out.print("Enter the employee ID: ");//user input
String id = keyboard.nextLine();
System.out.print("Enther the Hire Date for "+ name +": ");//user input
String date = keyboard.nextLine();
System.out.print("Enter the Shift: 1 for day," + " 2 for night: ");//user input
int shift = keyboard.nextInt();
System.out.print("Enter the Hourly Rate");//user input
double rate = keyboard.nextDouble();
System.out.print("Enter the team leader monthy bonus: ");//user input
double bonus = keyboard.nextDouble();
System.out.print("Enter training hours: ");//user input
double hours = keyboard.nextDouble();		
p1.setName(name);
p1.setEmpNum(id);
p1.setHireDate(date);
p1.setShift(shift);
p1.setHourRate(rate);
p1.setFixedBonus(bonus);
p1.setTraininghours(hours);		
System.out.println("Name: " + p1.getName());
System.out.println("Employee Id: " + p1.getEmpNum());
System.out.println("Hire Date: " + p1.getHireDate());
if(p1.getShift() == 1){
System.out.println("Shift: Day");
} else {
System.out.println("Shift: night");
}
System.out.println("Pay Rate: " + p1.getHourRate());
System.out.println("Your Fixed bonus: $" + p1.getFixedBonus());
System.out.println("Training hours: " + p1.getTraininghours());
}
}
