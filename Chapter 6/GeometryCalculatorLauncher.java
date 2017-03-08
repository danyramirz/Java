import java.util.Scanner;
public class GeometryCalculatorLauncher {
	public static void main(String[] args) {
		double radius, length, width, base, height;
		int userInput = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geometry Calculator");
		System.out.println(" Calculate the Area of a Circle");
		System.out.println(" Calculate the Area of a Rectangle");
		System.out.println(" Calculate the Area of a Triangle");
		System.out.println(" Quit");
		System.out.println("Enter your choice (1-4)");
		while (userInput != 4) {
			userInput = keyboard.nextInt();
			
			if (userInput < 1 || userInput > 4) {
				System.out.println("ERROR: you can not enter a negative number or a value over 4");
				System.out.println("Enter your choice 1-4");
				continue;
			} else {
				if (userInput == 1) {
					System.out.println("Enter the radius of the circle: ");
					radius = keyboard.nextDouble();
					if (radius < 0) {
						System.out.println("Radius can not be a negative number");
					} else {
						System.out.println("Area = " + GeometryCalculator.circleArea(radius));
					}
				} else if (userInput == 2) {
					System.out.println("Enter the length of the rectangle: ");
					length = keyboard.nextDouble();
					if (length < 0) {
						System.out.println("Length can not be a negative number");
					} else {
						System.out.println("Enter the width of the rectangle: ");
						width = keyboard.nextDouble();
						if (width < 0) {
							System.out.println("Width can not be a negative number");
						} else {
							System.out.println("Area = " + GeometryCalculator.rectangleArea(length, width));
						}
					}
				} else if (userInput == 3) {
					System.out.println("Enter the base of the triangle: ");
					base = keyboard.nextDouble();
					if (base < 0) {
						System.out.println("Base can not be a negative number");
					} else {
						System.out.println("Enter the height of the triangle: ");
						height = keyboard.nextDouble();
						if (height < 0) {
							System.out.println("Height can not be a negative number");
						} else {
							System.out.println("Area = " + GeometryCalculator.triangleArea(base, height));
						}
					}
				}
			}
		}
		keyboard.close();
	}

}