public class GeometryCalculator {
	
	public GeometryCalculator() {	
	}
	public static double circleArea(double Radius) {
		double radius = Radius;
		double area;
		area = Math.PI * (radius * radius);
		return area;
	}
	public static double rectangleArea(double Length, double Width) {
		double length = Length;
		double width = Width;
		double area;
		area = length * width;
		return area;
	}
	public static double triangleArea(double Base, double Height) {
		double base = Base;
		double height = Height;
		double area;
		area = (base * height) * 0.5;
		return area;
	}
}




