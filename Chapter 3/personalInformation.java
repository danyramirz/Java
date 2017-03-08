import java.util.Scanner;

public class personalInformation {
	//private variables
	private String name;
	private String address;
	private int age;
	private String phoneNumber;

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		personalInformation[] person = new personalInformation[3];
		for(int i = 0; i <= person.length - 1; i++){
			//instantiates person
			person[i] = new personalInformation();
			System.out.print("Enter name for person");
			String userName = keyboard.next();
			person[i].setName(userName);
			//input for age
			System.out.printf("Enter Age for %s ", person[i].getName());
			int userAge = keyboard.nextInt();
			person[i].setAge(userAge);
			//input for address
			System.out.printf("Enter Address for %s " , person[i].getName());
			String userAddr = keyboard.next();
			person[i].setAddress(userAddr);
			//input for phone number
			System.out.printf("Enter Phone Number for %s ", person[i].getName());
			String userPhone = keyboard.next();
			person[i].setPhoneNumber(userPhone);
		}
		
		//display user info
		for(int x = 0; x <= person.length - 1; x++){
			System.out.printf("Name: %s \t Age: %s \t Address: %s \t " + "Phone Number: %s \n", person[x].getName(), person[x].getAge(), person[x].getAddress(), person[x].getPhoneNumber());		
		}
		
	}
	//getters and setters
	public personalInformation() {
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
