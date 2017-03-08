
public class num4Essay extends num4Graded{

	//private methods 
private double grammar;
private double spelling;
private double correctLength;
private double content;
private double total;

public double getGrammar()
{
return grammar;
}
public void setGrammar(double grammar)
{
this.grammar = grammar;
}
public double getSpelling()
{
return spelling;
}
public void setSpelling(double spelling)
{
this.spelling = spelling;
}
public double getCorrectLength()
{
return correctLength;
}
public void setCorrectLength(double correctLength)
{
this.correctLength = correctLength;
}
public double getContent()
{
return content;
}
public void setContent(double content)
{
this.content = content;
}
public num4Essay(double grammar, double spelling, double correctLength, double content)
{
super();
this.grammar = grammar;
this.spelling = spelling;
this.correctLength = correctLength;
this.content = content;
total = grammar + spelling + correctLength + content;
setScore(total);
}
	}