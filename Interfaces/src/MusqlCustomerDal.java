
public class MusqlCustomerDal implements ICustomerDal , IRepository{

	@Override
	public void add() {
		System.out.println("My Sql Eklendi");
	}

}
