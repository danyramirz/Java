
public class excelstudent {
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excelstudent student1 = new excelstudent("Juan");
		excelstudent student2 = new excelstudent("quan");
		excelstudent student3 = new excelstudent("buan");
		excelstudent student4 = new excelstudent("luan");
		excelstudent student5 = new excelstudent("kuan");

	}

	public excelstudent(String n) {
		this.name = n;
		System.out.println("Welcome, " + name + ", you are an excellent student!");
	}
	
}
