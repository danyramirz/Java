
public class four {
	Boolean test;
	int num1, num2, result;
public static void main(String[] args) {
		// TODO Auto-generated method stub
	four row1 = new four(true, 1, 2);
	four row2 = new four(true, 8, 9);
	four row3 = new four(false, 1, 2);
	}


	public four(Boolean con, int one, int two) {
		// TODO Auto-generated constructor stub
		this.test = con; 
		this.num2 = one;
		this.num2 = two;
		String text;
		
		
		if(con == true){
			if (one + two < 10){
				text = "Grandpa Buffet Discount, greater than ten";
			}
			else {
				text = "No Grandpa Discount, less than ten";
			}
		}
		else {
			text = "no discount";
		}
		System.out.println(text);
		
	}

	

}
