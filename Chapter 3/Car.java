
public class Car {
  private int yearModel;
  private String make;
  private int speed;
  //other
  private int accelerate;
  private int brake;
	
	
	
	
	
    public static void main(String[] args) {
     Car my = new Car();
     //fields
     my.setYearModel(2015);
     my.setMake("Mazda");
     my.setSpeed(50);
    
     
     System.out.println(my.getYearModel() +"\t"+ my.getMake() +"\t"+ my.getSpeed());
     //accelerating info
     System.out.println("Accelerating");
     
     
     
     
     for(int i = 1; i<=5; i++){
    	 my.setAccelerate(5);
    	 System.out.println("current speed: "+ my.getSpeed());
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }	 
    //print brakes
     System.out.println("Braking");
     	for(int i = 1; i<=5; i++){
     		my.setBrake(5);
     		System.out.println("Current Speed:  "+ my.getSpeed());
     	}   	    	 
     }

    public Car() {
    	// TODO Auto-generated constructor stub
    }


	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getAccelerate() {
		return accelerate;
	}


	public void setAccelerate(int accelerate) {
		this.speed = speed + 5;
	}



	public int getBrake() {
		return brake;
	}


	public void setBrake(int brake) {
		this.speed = speed -5;
	}
    }  
