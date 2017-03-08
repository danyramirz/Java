import java.util.Scanner;
public class FatGramLauncher {

	public static void main(String[] args) {
		double calories;
		double fatGrams;
		//import scanner
		Scanner keyboard = new Scanner(System.in);
		//input user calories
		System.out.println("Enter the amount of calories in a food: ");
		calories = keyboard.nextDouble();
		//input user grams
		System.out.println("Enter the amount of grams of fat the food has:");
		fatGrams = keyboard.nextDouble();
		FatGram food1 = new FatGram(calories, fatGrams);
		if (food1.getCalories() > food1.getGrams() * 9) {
			//displays info
			System.out.println("Calories: " + food1.getCalories());
			System.out.println("Grams of fat: " + food1.getGrams());
			System.out.println("Percentege of fat: " + food1.percFat() + "%");
			if (food1.percFat() < 0.60) {
				System.out.println("The food is low in fat");
			}
		} else {
			//display output
			System.out.println("The calories from fat can not be more than the total calories of the food");
		}
		keyboard.close();
	}

}