
public class swim {
	boolean wateriswarm;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
swim one = new swim(false);
swim two = new swim(true);
	}
	
	public swim(boolean wateriswarm) {
		// TODO Auto-generated constructor stub
if (wateriswarm == true){
	System.out.println("the water is warm, go for a swim!");
}
else System.out.println("the water is cold, get out!");
	}
	
}
