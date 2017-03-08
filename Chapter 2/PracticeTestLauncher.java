import javax.swing.JOptionPane;

public class PracticeTestLauncher {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double phonePurchase,
		purchaseComm ,
		amountPaid,
		phoneSale,
		sellingComm,
		sellingAmount,
		profitOrLoss; 
		
		final double NUM_PHONE = 235,
				PURCHASE_PRICE = 65.43,
				PHONES_SOLD = 167,
				SELLING_PRICE = 124.56,
				JILL_COMM_RATE = .03,
				BILL_COMM_RATE = .06;
		
		
		phonePurchase = NUM_PHONE * PURCHASE_PRICE;
		purchaseComm = phonePurchase * JILL_COMM_RATE;
		amountPaid = phonePurchase + purchaseComm;
		phoneSale = PHONES_SOLD * SELLING_PRICE;
		sellingComm = phoneSale * BILL_COMM_RATE;
		sellingAmount = phoneSale - sellingComm;
		profitOrLoss = sellingAmount - amountPaid;
			
		System.out.println("The cost of purchasng the phones was $" + phonePurchase);
		System.out.println("Jill's commission for purchasing the phones was $" + purchaseComm);
		System.out.println("The total amount paid was $" + amountPaid);
		System.out.println("The total of all the phones sold was $" + phoneSale);
		System.out.println("Bill's commission for selling the phones was $" + sellingComm);
		System.out.println("The total amount sold after commission was $" + sellingAmount);
		
		if(profitOrLoss > 0){
			System.out.println("You have made a profit of $" + profitOrLoss);
		}else if(profitOrLoss < 0){
			System.out.println("You have lost $" + profitOrLoss);
		}else{
			System.out.println("You have came out even!");
		}
		
		String name; 
		
		name = JOptionPane.showInputDialog("Enter your name.");
		
		JOptionPane.showMessageDialog(null, "Your name is " + name);
		
		
		// num = Double.parseDouble(string value) to convert from string to double
		// double value1 = 123.45678, value2 = 123.45678, value3 = 123.45678;
		// System.out.printf("%.1f %.2f %.3f, value1 value2 value3);
		// output- 123.4 123.46 123.457 the decimal places round
		// in the %1.2f format the one the number of spaces from the left and the 2 is how many decimal places it goes to
		// if the value is 1234567.89 use %,f to make the number produce commas ex: 1,234,567.89
		// a buffer error is when a variable is storing a value beyond it's limits
			
	}

}
