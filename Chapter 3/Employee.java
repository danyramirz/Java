
public class Employee {
	private String Name;
	private int IdNumber;
	private String Department;
	private String Position;
	
	
	public static void main(String[] args) {
		Employee Susan = new Employee();
		Employee Mark = new Employee();
		Employee Joy = new Employee();
		
		//Susan info 
		Susan.setName("Susan Meyers");
		Susan.setIdNumber(47899);
		Susan.setDepartment("Accounting");
		Susan.setPosition("Vice President");
		
		
		//Mark info 
		Mark.setName("Mark Jones");
		Mark.setIdNumber(39119);
		Mark.setDepartment("IT");
		Mark.setPosition("Programer");
				
				
		//Joy info 
		Joy.setName("Joy Rogers");
		Joy.setIdNumber(81774);
		Joy.setDepartment("Manufacturing");
		Joy.setPosition("Engineer");
		
		//display info
		System.out.println(Susan.getName()+"\t"+ Susan.getIdNumber()+"\t"+ Susan.getDepartment()+"\t"+ Susan.getPosition());
		System.out.println(Mark.getName()+"\t"+ Mark.getIdNumber()+"\t"+ Mark.getDepartment()+"\t"+ Mark.getPosition());
		System.out.println(Joy.getName()+"\t"+ Joy.getIdNumber()+"\t"+ Joy.getDepartment()+"\t"+ Joy.getPosition());
		
	}
		public Employee() { }	
		//Name get set
		public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
//IdNumber get set
	public int getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(int idNumber) {
		IdNumber = idNumber;
	}

//Department get set
	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}

//Position get set
	public String getPosition() {
		return Position;
	}


	public void setPosition(String position) {
		Position = position;
	}


}
