import java.util.Scanner;
import javax.swing.JOptionPane;
 
 public class ShippingCharges {
	 
   public static void main(String [] args)
   {
     double packageWeight;
     String inputWeight;
     
     inputWeight = JOptionPane.showInputDialog("Enter the weight");
     packageWeight = Double.parseDouble(inputWeight);
     
     if (packageWeight <= 2)
     	System.out.println("Shipping is: $1.10");
     
     else if (packageWeight <= 6)
    	 System.out.println("Shipping is: $2.20");
     
     else if (packageWeight <= 10)
    	 System.out.println("Shipping is: $3.70");
	 
     else 
		 System.out.println("Shipping is: $4.80");   
   }
 }