import java.util.Scanner;
public class TestScoresLauncher
{
public static void main(String[] args)
{
//enter user input 
int[] scoresArray = getArray(getIntInput("enter the amount of test: "));
try {
TestScores theseScores = new TestScores(scoresArray);
//print out display
System.out.println("\nAverage score for test: " + theseScores.getAverage());
}
catch (IllegalArgumentException e)
{
//friendly user message
System.out.println("invalid test score\n" + e.getMessage());
}
}
public static int[] getArray(int intIn)
{
int[] scores = new int[intIn];
for (int i = 0; i < scores.length; i++)
{
//user input 
scores[i] = getIntInput("Enter score for tests: " + (i+1));
}
return scores;
}
public static int getIntInput(String stringIn)
{
Scanner keyboard = new Scanner(System.in);
System.out.println(stringIn);
return keyboard.nextInt();
}
}
