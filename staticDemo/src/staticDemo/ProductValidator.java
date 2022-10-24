package staticDemo; //Product Validator'u bir ürünü kayderken, güncellerken ürünün kurallara uygun olup olmadığını kt etmek için kullanırız.

public class ProductValidator {
	
	
	static {														//Static yapıcı bloklar da örnekteki gibi oluşturulur. 
		System.out.println("Static Yapıcı Blok Çalıştı");
	}
	
	/*public ProductValidator() {									//Constructor metodunu kulandığımızda da product managerde new'lemeden çalıştıramayız.
			System.out.println("Yapıcı Blok Çalıştı");}*/
																	// boolean metodunda static kullanırsak product managere gönderirken class																// adıyla newlemeden işlemimizi gerçekleştirebiliriz.
	public static boolean isValid(Product product) {

		if (product.price > 0 && !product.name.isEmpty()) {
			return true;											// product.nameisEmpty ürün ismi boş ise demek başına '!' operatörü ekleyince
																	// "değilse"anlamına geliyor.
		} else {
			return false;
		}																	
	}

	public void birsey() { 											// mesela birsey metodumuzu static yapmadığımız için managere getirecek olursak
																	// bunu new'leyerek gerçekleştirebiliriz.																	// bu bağlamda bir metodu static yaparak başka bir classta, class adıyla																// cağırabiliriz ve direkt olarak bellekte oluşturulur. new'lememize gerek kalmaz.
	}
	
	public static class BaskaBirClass {
		
		public static void sil() {									//java'da  ana class statik olamaz. C#' da kullanılabilir. Fakat inner class kullandıysak 
																	//class'ı da static olarak kullanabiliyoruz.
		}
	}
}

