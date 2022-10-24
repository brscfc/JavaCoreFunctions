package abstractDemo;

public class CustomerMagaer {
	
	BaseDatabaseManager baseDatabaseManager;
																				//strateji görevi gören verimiz.
	
	public void getCustomers() {
		baseDatabaseManager.getData();
			
	}

}
