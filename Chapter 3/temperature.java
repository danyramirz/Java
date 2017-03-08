import java.util.Scanner;

public class temperature {
	
	private double FTemp;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		temperature temp = new temperature();
		
		//user input
		System.out.println("Enter a Temperature: ");
		double userInput = keyboard.nextDouble();
		temp.setFahrenheit(userInput);
		//prints temperature 
		System.out.printf("Fahrenheit: %.2f \tCelsius: %.2f\t" + "Kelvin: %.2f\n",temp.getFahrenheit(),temp.getCelsius(),temp.getKelvin());

	}

	public temperature() {
	}
	public double getFahrenheit() {
		return FTemp;
	}

	public void setFahrenheit(double fTemp) {
		FTemp = fTemp;
	}
	public double getCelsius() {
		return (5.0/9.0) * (FTemp - 32);
	}
	public double getKelvin() {
		return ((5.0/9.0) * (FTemp - 32)) + 273;
	}

}
