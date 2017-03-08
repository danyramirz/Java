import java.util.Scanner;

	public class TimeCalculator {
		
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			// Declare number constants to hold time values in seconds
			int time;
			int userInput;
			System.out.print("Enter the number of seconds: ");
			userInput = keyboard.nextInt();
			if (userInput < 60){
				System.out.printf("%d seconds are less than a minute", userInput);
			}else if (userInput >= 60 && userInput < 3600){
				time = userInput / 60;
				System.out.printf("for %d seconds there are %d minutes", userInput, time);
			}else if (userInput >= 3600 && userInput < 864000){
				time = userInput / 3600;
				System.out.printf("for %d seconds there are %d Hours", userInput, time );
			}else{
				time = userInput / 86400;
				System.out.printf("for %d seconds there are %d days", userInput, time);
			}
		}
	}
	
			