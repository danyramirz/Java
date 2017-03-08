
public class GoldTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUM_BARS;
		
		final double PURCHASE_PRICE = 11562,
					  SELLING_PRICE = 13243,
					  BROKE_COMM_RATE = 0.03;
	
		double goldPurchase ,
				purchaseComm,
				amountPaid,
				goldSale,
				sellingComm,
				amountRecieved,
				profitOrLoss;
		
		
		goldPurchase = 567 * PURCHASE_PRICE;
		purchaseComm = goldPurchase * BROKE_COMM_RATE;
		amountPaid = goldPurchase + purchaseComm;
		goldSale = 567 * SELLING_PRICE;
		sellingComm = goldSale * BROKE_COMM_RATE;
		amountRecieved = goldSale - sellingComm;
		profitOrLoss = amountRecieved - amountPaid; 
		
		System.out.printf("Jack paid $%,.2f for the gold. \njack paid his broker a commission of $%,.2f on the purchase. " + "\nSo jack paid a total of $%,.2f \n\n jack sold the gold for $%,.2f"
				+ "\nJack paid his broker a commission of $%,.2f on the sale. \n " + "so jack recieved a total of $%,.2f\n\n"
				+"jack\'s profit or loss : $%,.2f", goldPurchase, purchaseComm, amountPaid, goldSale, sellingComm, amountRecieved, profitOrLoss);
		

	}

}
