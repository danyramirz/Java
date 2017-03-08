import java.util.Scanner;

public class num3Launcher {

public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
num3Charge p1 = new num3Charge();
int userInput = 0;
		
do {
System.out.println("please enter a id number or type 999 to quit");//input data 
			
userInput = keyboard.nextInt();
if (userInput != 999){
if (p1.squaetialSearch(userInput) == -1){
					
System.out.println("The number is not there please try again");//friendly message to the user
}
else {
System.out.println("the number you entered is valid");//output data
}	
}
}while(userInput != 999);
}
}
