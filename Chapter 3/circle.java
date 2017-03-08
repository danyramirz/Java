import java.util.Scanner;
//private variables
public class circle {
	private double Radius;
	private double Area;
	private double Diameter;
	private double Circumference;
	private double PI = 3.14159;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle shape = new circle();
		Scanner keyboard = new Scanner(System.in);
		//input for radius
		System.out.print("Enter a radius for the circle: ");
		double radi = keyboard.nextDouble();
		shape.setRadius(radi);
		//display info
		System.out.printf("the area is %.4f the diamter is %.4f" + " 3the circumference is %.4f"
		, shape.getArea(), shape.getDiameter(), shape.getCircumference());

	}
//getters and setters
	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}

	public double getArea() {
		return PI * Radius * Radius;
	}

	public void setArea(double area) {
		Area = area;
	}

	public double getDiameter() {
		return Radius * 2;
	}

	public void setDiameter(double diameter) {
		Diameter = diameter;
	}

	public double getCircumference() {
		return 2* PI * Radius;
	}

	public void setCircumference(double circumference) {
		Circumference = circumference;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public circle() {
		// TODO Auto-generated constructor stub
	}

	
}
