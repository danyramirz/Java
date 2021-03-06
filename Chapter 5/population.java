import javax.swing.JOptionPane;
public class population {
	private double startingNum ; // starting number 
	private double avgDailyIncrease; //daily increase
	private double numDaysMultiplied; //number of days a specie will multiply
	private double currentPopulation;//amount of population
	/**
	 * @return the startingNum
	 */
	public double getStartingNum() {
		return startingNum;
	}
	/**
	 * @param startingNum the startingNum to set
	 */
	public void setStartingNum(double startingNum) {
		this.startingNum = startingNum;
	}
	/**
	 * @return the currentPopulation
	 */
	public double getCurrentPopulation() {
		 this.currentPopulation = ((this.currentPopulation * this.avgDailyIncrease) + this.currentPopulation);
		 return this.currentPopulation;
	}
	/**
	 * set the current population based on stating number
	 */
	public void setCurrentPopulation() {
		this.currentPopulation = this.startingNum;
		for (int i = 1; i < numDaysMultiplied; i++);
		this.currentPopulation = getCurrentPopulation();	
	}
	/**
	 * @return the avgDailyIncrease
	 */
	public double getAvgDailyIncrease() {
		return avgDailyIncrease;
	}
	/**
	 * @param avgDailyIncrease the avgDailyIncrease to set
	 */
	public void setAvgDailyIncrease(double avgDailyIncrease) {
		this.avgDailyIncrease = avgDailyIncrease;
	}
	/**
	 * @return the numDaysMultiplied
	 */
	public double getNumDaysMultiplied() {
		return numDaysMultiplied;
	}
	/**
	 * @param numDaysMultiplied the numDaysMultiplied to set
	 * Set the number of days Multiplied
	 */
	public void setNumDaysMultiplied(double numDaysMultiplied) {
		this.numDaysMultiplied = numDaysMultiplied;
		this.currentPopulation = numDaysMultiplied;
	}
	
    /*
    * *displays the size of the population
   */
	public void displayPopulationSize(){
		String myString = "";
		myString +="********* Species Population *********** \n"+
		"Starting population: " + this.startingNum +"\n" +
		"Average population increase: " + this.avgDailyIncrease +"\n"+
		"Numbers of days multiplied: " + this.numDaysMultiplied +"\n"+
		"Ending population: " + this.getCurrentPopulation();
		JOptionPane.showMessageDialog(null, myString);
	}
	public population() {		
	}//end constructor
}