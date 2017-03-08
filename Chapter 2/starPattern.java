
public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("-----------------");
		//System.out.println("| 4  *     *    |");
		//System.out.println("|   ***   ***   |");
		//System.out.println("|  ***** *****  |");
		//System.out.println("| **************| ");
		//System.out.println("|  ***** *****  |");
		//System.out.println("|   ***   ***   |");
		//System.out.println("|    *     *    |");
		//System.out.println("|   ***   ***   |");
		//System.out.println("|  ***** *****  | ");
		//System.out.println("| **************| ");
		//System.out.println("|  ***** *****  |");
		//System.out.println("|   ***   ***   | ");
		//System.out.println("|    *     *  4 |");
		//System.out.println("-----------------");
		
		
		
		//printCard();printCard();newLine();
		
		
		for(int i = 2; i <= 10; i++){
			buildCard(i);
		}
		
		buildCard("J");
		buildCard("Q");
		buildCard("K");
		buildCard("A");
		
		
		
		
		
	}
	
	public static void printSpace(int n){
		for(int i = 0; i < n; i++){
			System.out.print(" ");
		}		
	}
	
	public static void printStar(int n){
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}		
	}
	
	public static void printCard(){
		printStar(1);printSpace(4);printStar(1);printSpace(7);printSpace(4);printStar(1);printSpace(6);printStar(1);System.out.println();
		printStar(1);printSpace(3);printStar(3);printSpace(6);printSpace(3);printStar(3);printSpace(5);printStar(1);System.out.println();
		printStar(1);printSpace(2);printStar(5);printSpace(5);printSpace(2);printStar(5);printSpace(4);printStar(1);System.out.println();
		printStar(1);printSpace(1);printStar(7);printSpace(4);printSpace(1);printStar(7);printSpace(3);printStar(1);System.out.println();
		printStar(1);printSpace(2);printStar(5);printSpace(5);printSpace(2);printStar(5);printSpace(4);printStar(1);System.out.println();
		printStar(1);printSpace(3);printStar(3);printSpace(6);printSpace(3);printStar(3);printSpace(5);printStar(1);System.out.println();
		printStar(1);printSpace(4);printStar(1);printSpace(7);printSpace(4);printStar(1);printSpace(6);printStar(1);System.out.println();
	}
	
	public static void newLine(){
		System.out.println();
	}
	
	public static void printNum(int num){
		System.out.print(num);
	}
	
	public static void printString(String s){
		System.out.print(s);
	}
	
	public static void buildCard(int cardNum){
		printStar(25);
		newLine();
		printStar(1);printNum(cardNum);printSpace(22);printStar(1);newLine();
		printCard();printCard();
		printStar(25);
		newLine();		
		
	}
	
	public static void buildCard(String cardNum){
		printStar(25);
		newLine();
		printStar(1);System.out.print(cardNum);printSpace(22);printStar(1);newLine();
		printCard();printCard();
		printStar(25);
		newLine();		
		
	}
	

}
