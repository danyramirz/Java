
public class retailItem {

	private String descrpt;
	private int unitsOnHand;
	private double price;
	
	
	public static void main(String[] args) {
		retailItem item1 = new retailItem();
		retailItem item2 = new retailItem();
		retailItem item3 = new retailItem();
		
		//item 1
		item1.setDescrpt("jacket");
		item1.setUnitsOnHand(12);
		item1.setPrice(59.95);
		
		//item 2
		item2.setDescrpt("Designer Jeans");
		item2.setUnitsOnHand(40);
		item2.setPrice(34.95);
		
		//item 3
		item3.setDescrpt("Shirt");
		item3.setUnitsOnHand(20);
		item3.setPrice(24.95);
		
		//display input
		System.out.printf("item#1 \t%s \t%d \t%.2f\n", item1.getDescrpt(), item1.getUnitsOnHand(), item1.getPrice());
		System.out.printf("item#2 \t%s \t%d \t%.2f\n", item2.getDescrpt(), item2.getUnitsOnHand(), item2.getPrice());
		System.out.printf("item#3 \t%s \t%d \t%.2f\n", item3.getDescrpt(), item3.getUnitsOnHand(), item3.getPrice());

	}
//Getters and setters
	public retailItem() {
	}
	
	public String getDescrpt() {
		return descrpt;
	}


	public void setDescrpt(String descrpt) {
		this.descrpt = descrpt;
	}


	public int getUnitsOnHand() {
		return unitsOnHand;
	}


	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

}
	
