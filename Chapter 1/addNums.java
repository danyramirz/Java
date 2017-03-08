
public class addNums {
int num1, num2, result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			addNums rows1 = new addNums(1, 2);
			addNums rows2 = new addNums(3, 4);
			addNums rows3 = new addNums(5, 6);
			addNums rows4 = new addNums(7, 8);
			addNums rows5 = new addNums(9, 10);
	}
	
	
	
	
	
	public addNums(int one ,int two) {
		// TODO Auto-generated constructor stub
		this.num1 = one;
		this.num2 = two;
		this.result = one + two; 
		System.out.println(num1 + " + " + num2 + " = " +  result);
	}

	
}
