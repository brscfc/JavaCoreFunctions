package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla ();
	
												//public final void gameOver şeklinde yazsaydık eğer override edilemeyecekti.
	public void gameOver() {
		System.out.println("Oyun Bitti");

	}
}

  //Örneği başta yazdığımızda hepsinin aynı puanı aldığını kabul etmiştik. Fakat her bir oyuncu için farklı puanlamalar vb. değişiklikler yapılacaksa
//bunu iki farklı şekilde yapabiliriz. Birincisi: Aynı hesaplama metodunu, extends eden diğer claslarda yazıp override uygulayarak her classa farklı
//değişkenler verebiliriz. İkincisi: Abstract class kullanarak diğer claslarda kullanılacak olan metodu abstracta cevirip değişikikleri değiştirmek, 
//istediğimiz classlarda uygularız.

//abstract sınıflar asla new'lenemezler.