package staticDemo;

public class DatabaseHelper { 				// Crud = create/read/update/delete örneğin veritabanına bu işlemleri kullanabiliriz.

	
	public static class Crud {

		public static void delete() {		// Buradaki sınıf ve metodlar Inner classa örnektir. Fakat SOLID kuralına uymak gerek bu yüzden her zaman
											//classlara single responsibility tanımla. Örneğin, Crud ile Connection' u farklı sınıflar açarak kulllanmalıyız.
		}

		public static void Update() {

		}
	}

	public static class Connection {

		public static void createConnection() {

		}

	}

}
