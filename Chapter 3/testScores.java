import java.util.Scanner;

public class testScores {
	//private variables
	private double scores;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		testScores test = new testScores();
		//3 test scores
		for(int i = 0; i < 3; ++i){
			//display test score
			System.out.print("Enter Test Score: ");
			double score = keyboard.nextDouble();
			test.setScores(score);
		}
		//average display
		System.out.printf("The average of the scores is %.2f", test.getScores());

	}
	//getters and setters
	public double getScores() {
		return scores / 3;
	}

	public void setScores(double scores) {
		this.scores += scores;
	}

	public testScores() {
		// TODO Auto-generated constructor stub
	}

}
