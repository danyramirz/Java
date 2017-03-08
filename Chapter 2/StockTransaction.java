
public class StockTransaction
{
   public static void main(String[] args)
   {
      
	   //creating variables 
	   int totalshare;
	   double perstock;
	   double com1, com2;
	   double perstock2;
	   double totalamt;
	   double totalamt2; 
	   
	   //setting variables
	   totalshare = 1000;
	   perstock = 32.87;
	   perstock2 = 33.92;
	   totalamt = totalshare * perstock;
	   totalamt2 = totalshare * perstock2; 
	   com1 = totalamt * .02;
	   com2 = totalamt2 * 0.02;
	 
	   //information
	   System.out.println( "the ammount of money joe paid for stock is " + totalamt);  
	   System.out.println( "the ammount of commission earned when stock was bought is " + (totalamt*0.02)); 
	   System.out.println( "the ammount joe sold is stock for is " + totalamt2);
	   System.out.println( "the ammount of commission earned when stock was sold is " + (totalamt2*0.02)); 
	   System.out.println( "profits = $" + ((totalamt2 - com2) - (totalamt - com1)));
	   
	   }
}