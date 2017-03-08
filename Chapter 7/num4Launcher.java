import java.util.Scanner;

public class num4Launcher {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		num4Larger p1 = new num4Larger();
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println("Enter a number between 1 - 20: ");//input user data
		
		int number = keyboard.nextInt();
		
		p1.greaterThan(array, number);
	}

}
