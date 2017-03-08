import java.util.Scanner;

public class widget {

	private double wigNumber;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many widgets need to be made: ");
		double wigNum = keyboard.nextDouble();
		widget order = new widget();
		order.setWigNumber(wigNum);
		
		System.out.printf("The number of days needed is %,.2f to produce your widgets", order.getWigNumber());

	}

	
	public widget() {
		//TODO Auto-generated constructor stub
	}
		
	public double getWigNumber() {	
		int wPerHour = 10, shiftHour = 8, numOfShift = 2;
		return (wigNumber / (wPerHour * shiftHour * numOfShift));
	}
		public void setWigNumber(double wigNumber) {
			this.wigNumber = wigNumber;
		}
		
	}
	

