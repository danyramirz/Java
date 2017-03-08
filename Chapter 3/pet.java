import java.util.Scanner;
public class pet {
	//private variables
	private String name;
	private String type;
	private int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	pet info = new pet();
	//input pet names
	System.out.print("Enter pets name: ");
	String name = keyboard.nextLine();
	info.setName(name);
	//input pet type
	System.out.print("Enter pet type: ");
	String type = keyboard.nextLine();
	info.setType(type);
	//enter pets age
	System.out.print("Enter pets age: ");
	int age = keyboard.nextInt();
	info.setAge(age);

	System.out.printf("Your %s, named %s is %d years old", info.getType(),
			info.getName(), info.getAge());	
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public pet() {
		// TODO Auto-generated constructor stub
	}
	
}
