import java.util.Scanner;
public class PayrollLauncher {
public static void main(String[] args) throws Exception {
try{
//variable declaration
String name,s1;
int hrs,rate,id;
//object
Payroll employee = new Payroll();
Scanner keyboard = new Scanner(System.in);
//display and input name
System.out.println("Enter name: ");
name = keyboard.nextLine();
//display id
System.out.println("Enter ID: ");
s1=keyboard.nextLine();
id=Integer.parseInt(s1);
//input hourly rate
System.out.println("Enter hourly rate: ");
s1 = keyboard.nextLine();
rate = Integer.parseInt(s1);
//enter hours
System.out.println("Enter hours: ");
s1 = keyboard.nextLine();
hrs = Integer.parseInt(s1);		
//values are set
employee.setName(name);
employee.setID(id);
employee.setHourlyRate(rate);
employee.setHours(hrs);
//display data
System.out.println("Name: " +employee.getName());
System.out.println("ID: " +employee.getId());
System.out.println("Hourly rate: " +employee.getHourlyRate());
System.out.println("hours: " +employee.getHours());
}
catch(InvalidID e){
System.out.println(e.getMessage());
}
catch(InvalidHourlyRate e){
System.out.println(e.getMessage());
}
catch(InvalidHours e){
System.out.println(e.getMessage());
}
}
}
