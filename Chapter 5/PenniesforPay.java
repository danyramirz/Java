public class PenniesforPay {
	//private variable
	//number of days
	private int days;
	
	//return amount of days
	public int getDays() {
		return days;
	}
	//set days and return
	public void setDays(int days) {
		this.days = days;
	}
	public PenniesforPay(int Days) {
		this.days = Days;
	}
	public void salary() {
		double salary = 0.01;
		//display output
		System.out.println("Days \t\t\t Salary");
		System.out.println("----------------------------------");
		for (int i = 1; i <= days; i++) {
			System.out.println(i + "\t\t\t$" + salary);
			salary = salary * 2;
		}
	}
}