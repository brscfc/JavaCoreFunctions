package abstractDemo;

public class Main {
	
	public static void main(String[] args) {
		
		CustomerMagaer customerManager = new CustomerMagaer();
		customerManager.baseDatabaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}
