import java.util.Scanner;

public class num6Launcher {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		String[] student = new String[20];
		
		System.out.println("Fake it until you make it! please enter a letter: ");//user input 
		
		
		for(int i = 0; i < student.length; i++){
			System.out.println("A");
			System.out.println("B");
			System.out.println("C");
			System.out.println("D");

			student[i] = keyboard.nextLine().toUpperCase();
		}
		
		num6Driver p1 = new num6Driver(student);
		if (p1.passed() == true){
			System.out.println("You Passed");//friendly message to user
		}else {
			System.out.println("You failed");//friendly message to user
		}
		System.out.println("Your Total Correct you got right is: " + p1.getTotalCorrect());//total correct of answers
		
		System.out.println("The Total Incorrect you got is: " + p1.getTotalIncorrect());//total incorrect
		
		System.out.println("You missed the these Questions" + p1.getQuestionsMissed());//questions not answered
	}

}
