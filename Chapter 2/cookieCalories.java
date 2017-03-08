import java.util.Scanner; 

public class cookieCalories 
{ 

public static void main(String[] args) 
{ 
Scanner keyboard = new Scanner(System.in); 

double cookiesEaten, calories; 

System.out.print("Enter cookies eaten: "); 
cookiesEaten = keyboard.nextDouble(); 

calories = cookiesEaten * 75; 

System.out.print("Total calories consumed: " + calories); 
keyboard.close(); 
} 
} 

