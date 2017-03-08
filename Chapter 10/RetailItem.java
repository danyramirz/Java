public class RetailItem {
//private fields
private String description;
private int units;
private double price;
	
public RetailItem(){	
}
//constructor
public RetailItem(String des, int u, double p)throws InvalidPrice,InvalidUnits {
description = des;
if(u<0)
throw new InvalidUnits(u);
else 
units = u;
units = u;
if(p<0)
throw new InvalidPrice(p);
else
price=p;
}
//mutator
public void setDescription(String des){
description = des;
}
public double getPrice(){
return price;
}
public void setPrice(double p)throws InvalidPrice{
if (p<0)
throw new InvalidPrice(p);
else 
price = p;
}
public int getUnits(){
return units;
}
//this is a mutator function 
void setUnits(int u)throws InvalidUnits{
if(u<0)
throw new InvalidUnits(u);
else
units = u;
}
public String getDescription(){
return description;
}
}