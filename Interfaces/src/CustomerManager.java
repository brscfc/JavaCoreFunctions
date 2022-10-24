
public class CustomerManager {		 // iş kodlarını buraya yazılır. CustomerManager.

	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {

		this.customerDal = customerDal;
	}

	public void add() {

		customerDal.add();
	}

}
