public class DistanceTraveled {
	//private variables 
	private int hours; // number of hours
	private int speed;// speed reached
	private int distance;//distance reached
	
	public void getDistance() {
		for (int i = 1; i <= this.hours; i++) {
			distance = this.speed * i;
			System.out.println(i + "\t\t\t" + distance);
		}
	}
	//return hours
	public int getHours() {
		return hours;
	}
	//return set hours
	public void setHours(int hours) {
		this.hours = hours;
	}
	//set the speed
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//distance traveled 
	public DistanceTraveled(int Hours, int Speed) {
		this.hours = Hours;
		this.speed = Speed;
	}

}
