
public class Main {
																
	public static void main(String[] args) {
		
		CustomerManager customerManager = new  CustomerManager(new SqlServerCustomeManager());
		customerManager.add();
		
	}
}









//interface'ler new'lenemezler metod imzası taşırlar. Bu yüzden implement ettiği classları çağırıyoruz newlerken.
// 1 Class birden fazla interface'yi implemente edebilir.