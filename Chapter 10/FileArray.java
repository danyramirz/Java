import java.io.*;
public class FileArray {
public FileArray() {
}
public static void WriteArray(String Name, int[] Array) throws IOException {
FileOutputStream fstream = new FileOutputStream(Name + ".dat");
DataOutputStream OutputFile = new DataOutputStream(fstream);
//friendly user message 
System.out.println("Writing to File");
for (int i = 0; i < Array.length; i++) {
OutputFile.writeInt(Array[i]);
}
fstream.close();
OutputFile.close();
//firendly user message 
System.out.println("Completed");
}
public static int[] readArray(String Name, int[] Array) throws IOException {
int[] Array2 = new int[Array.length];
FileInputStream fstream = new FileInputStream(Name + ".dat");
DataInputStream inputFile = new DataInputStream(fstream);
int number;
//friendly user message 
System.out.println("Reading from the file");
try{
for(int i = 0; i < Array.length; i++){
try {
number = inputFile.readInt();
Array2[i] = number;				
} catch (EOFException e) {
System.out.println("End of the file");
break;
}
}
}catch(Exception e){
System.out.println(e.getMessage());
}finally{
fstream.close();
inputFile.close();
//friendly user message
System.out.println("complete!");
}
return Array2;
}
}
