import java.text.DecimalFormat;
import java.util.Scanner;

public class num7Launcher {
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
num7Quarterly p1 = new num7Quarterly();
final int DIV = 6;
final int QTRS = 4;
double [][] sales = new double [QTRS][DIV];//beginning brace is rows 
DecimalFormat money = new DecimalFormat("$#,##0.00");
		
for(int r = 0; r < QTRS; r++ ){
for(int c = 0; c < DIV; c++){
System.out.println("Enter the Sales for Quarter " + (r+ 1) + " Division " + (c + 1));//user input 
sales[r][c] = keyboard.nextDouble();
while(sales[r][c] < 0){
System.out.println("not acceptable bro! enter the sales for quarter again " + (r+ 1) + " Division " + (c + 1));
//friendly message to user 
sales[r][c] = keyboard.nextDouble();
}
p1.setTotalSales(sales[r][c]);
}
p1.counter();
}
// displays all the sales
System.out.println("\tDiv 1. \tDiv 2. \tDiv 3. \tDiv 4. \tDiv 5. \tDiv 6. \t");
for(int r = 0; r < QTRS; r++ ){
System.out.print("QRT " + (r+ 1)+ "   ");
for(int c = 0; c < DIV; c++){
System.out.print(money.format(sales[r][c]) + "\t");
				
}
System.out.print("\n");
}
		
// division increase or decrease
for(int c = 0; c < DIV; c++){
for(int r = 0; r < QTRS; r++ ){
			
if (r > 0){
double total = sales[r][c] - sales[r-1][c];
System.out.println(" Division " + (c+1) + " quarter " + (r+1) +  " there was a " + money.format(total) + " Change");
} 
}
		
}
		
// gets the total sales per quarter
for(int r = 0; r < QTRS; r++ ){
System.out.println("The total sales for quarter" + (r + 1) + " is " + money.format(p1.getTotalSales()[r]));
}
		
//gets the increase or decrease for the company
for(int r = 0; r < QTRS; r++ ){
if (r != 0){
double company = p1.getTotalSales()[r] - p1.getTotalSales()[r-1];
System.out.println("The companys change for quarter " +(r+ 1)+ " is " + money.format(company));
}	
}
//gets the average amount of sales for the company per quarter
for(int r = 0; r < QTRS; r++ ){
p1.setAVGSales(r);
System.out.println("quarter " + (r+1) + " the average is " + money.format(p1.getAVGSales()));
}		
//gets the division with the highest sales per quarter
for(int r = 0; r < QTRS; r++ ){
	
double high = sales[r][0]; 
int team = 1;
for(int c = 0; c < DIV; c++){
if(sales[r][c] > high){
high = sales[r][c];
team = c+ 1;
}
}
System.out.println("The Division with the highest sales is division: " + team);
}
}

}
