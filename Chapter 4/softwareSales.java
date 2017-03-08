import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
 
 
public class softwareSales
{
	static double BASE_FEE = 10;

	public static void main(String[] args) {

	    // define rages for checks
	    RangeMap<Integer, Double> checkFee = TreeRangeMap.create();
	    checkFee.put(Range.closed(0, 19), .1);
	    checkFee.put(Range.closed(20, 39), .8);
	    checkFee.put(Range.closed(40, 59), .6);
	    checkFee.put(Range.closed(60, Integer.MAX_VALUE), .4);

	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    // Get the number of checks written.
	    System.out.print("Enter the number of checks written " + "this month: ");
	    int numChecks = keyboard.nextInt();

	    //close scanner
	    keyboard.close();

	    // calculate total fee
	    double total = BASE_FEE + (checkFee.get(numChecks) * numChecks);

	    // Display the total bank fees.
	    System.out.printf("The total fees are $%.2f\n", total);
	}