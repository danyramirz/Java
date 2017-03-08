import java.util.Scanner;

public class num1Launcher {

	 public static void main(String[] args){
		 Scanner keyboard = new Scanner(System.in);
		 romanNumerals num = new romanNumerals();
		 //gets user input
		 int number = 0;
		 //continues to run program
		 while (number != 999){	 
			 System.out.print("Enter a number of 1 through 10: ");
			 number = keyboard.nextInt();
			 num.setNumber(number); 
			 num.getNumber();
		 }
	 }

}
