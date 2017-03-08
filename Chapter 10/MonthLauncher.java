
public class MonthLauncher {

public static void main(String[] args) throws Exception {
try{
//objects were created
Month object1=new Month();
Month object2=new Month("March");
//set function
object1.setMonthNumber(13);
System.out.println("Month: "+object1.toString());
}
catch(InvalidNumber e){
System.out.println(e.getMessage());
}
}
}
