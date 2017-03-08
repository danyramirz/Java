public class num10Launcher {

public static void main(String[] args) {
num10Ship s1 = new num10Ship("Titanic", "1909");
num10CruiseShip s2 = new num10CruiseShip("Titanic", "1909", 1317);
num10CargoShip s3 = new num10CargoShip("Titanic", "1909", 90000);		
System.out.println(s1.toString());
System.out.println(s2.toString());
System.out.println(s3.toString());
	}
}
