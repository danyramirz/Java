import java.util.Scanner;

public class romanNumerals
{
	private int number;
	
public romanNumerals() {
	// TODO Auto-generated constructor stub
}

/**
 * @return the number
 */
public void getNumber() {
	// Display the Roman numeral.
			 switch (number)
			 {
					 case 1 :
						 System.out.println("The Roman Number is: I");
						 break;
					 case 2 :
						 System.out.println("The Roman Number is: II");
						 break;
					 case 3 :
						 System.out.println("The Roman Number is: III");
						 break;
					 case 4 :
						 System.out.println("The Roman Number is: IV");
						 break;
					 case 5 :
						 System.out.println("The Roman Number is: V");
						 break;
					 case 6 :
						 System.out.println("The Roman Number is: VI");
						 break;
					 case 7 :
						 System.out.println("The Roman Number is: VII");
						 break;
					 case 8 :
						 System.out.println("The Roman Number is: VIII");
						 break;
					 case 9 :
						 System.out.println("The Roman Number is: IX");
						 break;
					 case 10 :
						 System.out.println("The Roman Number is: X");
						 break;
					 default :
						 System.out.println("Invalid number. You have failed your family.");
			 		}
}

/**
 * @param number the number to set
 */
public void setNumber(int number) {
	this.number = number;
}

 
 
}