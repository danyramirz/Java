
public class inventoryLauncher {

	public static void main(String[] args) {
		inventoryItem account1 = new inventoryItem();
		inventoryItem account2 = new inventoryItem();
		
		System.out.println("The amount in account 1 is " + account1.getBalance());
		System.out.println("The amount in account 2 is " + account2.getBalance());
		
	}
}