
public class InvalidID extends Exception {
	public InvalidID(int n){
		super("Cannot be negative or zero " + n);
	}
}
