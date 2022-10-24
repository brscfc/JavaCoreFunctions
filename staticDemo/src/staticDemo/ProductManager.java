package staticDemo;

public class ProductManager {
	
	public void add (Product product) {
															//bu tip manager sınıflarını static tanımlamayız.
		if(ProductValidator.isValid(product)) {				//isValid metoduna static ekleyerek Class adyla erişim sağladık.
			System.out.println("Ürün Başarıyla Eklendi.");
			
		}else {
			System.out.println("Ürün Bilgileri Geçersizdir.");
		}
		
		/*ProductValidator productValidator = new ProductValidator();
		productValidator.birsey();*/
	}
}
