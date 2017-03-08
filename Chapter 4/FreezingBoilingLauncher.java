
import java.util.Scanner;
public class FreezingBoilingLauncher {

	public static void main(String[] args) {
		double temp;
		//imported scanner class
		Scanner keyboard = new Scanner(System.in);
		//user input for temp
		System.out.println("Enter a temperature ");
		temp = keyboard.nextDouble();
		FreezingBoiling temp1 = new FreezingBoiling(temp);
		System.out.println("For " + temp1.getDegree() + " Degrees:");
		if(temp1.isEthylBoiling()){
			//if statements
		System.out.println("Ethyl Alcohol is Boiling");
		}
		if(temp1.isEthylFreezing()){
		System.out.println("Ethyl Alcohol is Freezing");
		}
		if(temp1.isOxygenBoiling()){
		System.out.println("Oxegen is Boiling");
		}
		if(temp1.isOxygenFreezing()){
		System.out.println("Oxegen is Freezing");
		}
		if(temp1.isWaterBoiling()){
		System.out.println("Water is Boiling");
		}
		if(temp1.isWaterFreezing()){

		System.out.println("Water is Freezing");
		}
		keyboard.close();

	}

}