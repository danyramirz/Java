
public class InvalidHourlyRate extends Exception{
	public InvalidHourlyRate(int n){
		super("cannot be negative or more than 25 ");
	}
}
