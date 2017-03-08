import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;





public class FileEncryption {

public static void main(String[] args) throws IOException{
File file = new File("C:\\Users\\Dany\\Desktop\\IWT\\4th Semester\\java\\chapter 10\\random1.txt");
Scanner inputFile = new Scanner(file);
//open a file to write
PrintWriter outputFile = new PrintWriter("file2.txt");
//reads line from file
while(inputFile.hasNext()){
//read the next line
String str = inputFile.nextLine();
for(int i = 0; i<str.length(); i++){
//get a character at a time
char ch = str.charAt(i);
//change the character into code
int code = (int)ch;
//modify and change into code
char c = (char)(code + 10);
//print to output file
outputFile.print(c);
}
inputFile.close();
outputFile.close();
}
}
}


