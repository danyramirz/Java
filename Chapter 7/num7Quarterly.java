public class num7Quarterly {
	private final int DIV = 6;//private fields 
	private final int QTRS = 4;
	private double totalSales[] = new double[QTRS];
	private double AVGSales;
	private int count = 0;
	public num7Quarterly() {
	}
	public void counter(){
		count++;
	}
	/**
	 * @return the totalSales
	 */
	public double[] getTotalSales() {
		return totalSales;
	}
	/**
	 * @param totalSales the totalSales to set
	 */
	public void setTotalSales(double sales) {
		totalSales[count] += sales;
	}
	/**
	 * @return the aVGSales
	 */
	public double getAVGSales() {
		return AVGSales;
	}
	/**
	 * @param aVGSales the aVGSales to set
	 */
	public void setAVGSales(int i) {
		AVGSales = totalSales[i] / DIV;
	}
}
