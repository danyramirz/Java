import java.util.Scanner;
import java.text.DecimalFormat;

public class num7Launcher {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		num7 rain = new num7();
		int years; //amount of years years
		//user input
		System.out.print("enter years to calculate: ");
		years = keyboard.nextInt(); // set the number of years
		while(years < 1){
			//friendly message to the user
		System.out.print("Invalid data try again: ");
		years = keyboard.nextInt();
		}
		rain.setYears(years);
		rain.setAvg(0);
		DecimalFormat multiple = new DecimalFormat("#,##0.00");
		System.out.println("For " + years + " year the average rainfall is " +
		multiple.format(rain.getAvg()));

		}
	}

