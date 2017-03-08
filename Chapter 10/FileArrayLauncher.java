import java.io.IOException;
import java.util.Scanner;
public class FileArrayLauncher {
public static void main(String[] args) throws IOException {
String Name;
int[] Arrays = new int[10];
int[] Array2 = new int[Arrays.length];
int userInput = 0;
Scanner keyboard = new Scanner(System.in);
//user input 
System.out.println("Enter the name of the file:");
Name = keyboard.nextLine();
for (int i = 0; i < Arrays.length; i++) {
	//user input
System.out.println("Enter a number");
userInput = keyboard.nextInt();
if (userInput != 999) {
Arrays[i] = userInput;
} else {
break;
}
}
FileArray array1 = new FileArray();
FileArray.WriteArray(Name, Arrays);
Array2 = FileArray.readArray(Name, Arrays);
for (int t = 0; t < Array2.length; t++) {
System.out.println(Array2[t]);
}
keyboard.close();
}
}
