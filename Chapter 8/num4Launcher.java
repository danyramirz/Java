import java.util.Scanner;

public class num4Launcher {

public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
		
System.out.print("Enter the Grammar Score: ");
double grammar = keyboard.nextDouble(); //input for grammar Score
while (grammar < 0 || grammar > 30){//will have to some validation
System.out.print("Incorret");//friendly message
System.out.print("Enter the Grammar Score: ");//user input
grammar = keyboard.nextDouble();
}
System.out.print("Enter the Spelling Score: ");//user input
double spelling = keyboard.nextDouble();
while(spelling < 0|| spelling > 20){
System.out.print("Incorret");//friendly message
System.out.print("Enter the Spelling Score: ");//user input
spelling = keyboard.nextDouble();
}
System.out.print("Enter the Correct Length Score: ");//user input
double length = keyboard.nextDouble();
while(length < 0|| length > 20){
System.out.print("Incorret");//friendly message
System.out.print("Enter the Correct Length Score: ");//user input
length = keyboard.nextDouble();
}
System.out.print("Enter the Content Score: ");//user input
double content = keyboard.nextDouble();
while( content < 0|| content > 30){
System.out.print("Incorret");//friendly messages
System.out.print("Enter the Content Score: ");//user input
content = keyboard.nextDouble();
}
//passes input into the class
num4Essay p1 = new num4Essay(grammar, spelling, length, content);
//output
System.out.println("The Student earned a " + p1.getGrade());
System.out.println("The Student's Score is " + p1.getScore());
System.out.println("The Grammer Score is " + p1.getGrammar());
System.out.println("The Spelling Score is " + p1.getSpelling());
System.out.println("The Correct Length Score is " + p1.getCorrectLength());
System.out.println("The Content Score is " + p1.getContent());
}
}
