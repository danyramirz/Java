public class TestScores
{
//private and public fields 
private int[] scores;
private int avg;
public TestScores(int[] scores)   throws IllegalArgumentException
{    		
avg = validateScoresCreateAverage(scores);
}
private int validateScoresCreateAverage(int[] scores)
{
int avg = 0;
for(int i =0; i < scores.length; i++)
{
if(scores[i] < 0 || scores[i] > 100)
//display 
throw new IllegalArgumentException("Score for test "+ (i+1) + " out of range.");
avg += scores[i];
}
return (avg / scores.length);
}
public int getAverage()
{
return avg;
}
}
