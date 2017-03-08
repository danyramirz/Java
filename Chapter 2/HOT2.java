
public class HOT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NUM_BARS;
		
		final double PURCHASE_PRICE = ,
					  SELLING_PRICE,
					  BROKE_COMM_RATE;
	
		double goldPurchase ,
				purchaseComm,
				amountPaid,
				goldSale,
				sellingComm,
				amountRecieved,
				profitOrLoss;
		
		
		goldPurchase = 567 * PURCHASE_PRICE;
		purchaseComm = goldPurchase * BROKE_COMM_RATE;
		amountPaid = goldPurchase * purchaseComm;
		goldSale = 567 * SELLING_PRICE;
		sellingComm = goldPurchase * BROKE_COMM_RATE;
		amountRecieved = goldPurchase + sellingComm;
		profitOrLoss = amountRecieved + amountPaid; 
		
		System.out.println("You have made a profit of $" + profitOrLoss);
	}

}


