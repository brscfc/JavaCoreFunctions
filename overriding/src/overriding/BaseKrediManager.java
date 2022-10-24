package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {		//eğer biz buradaki hesaplama metodunun override edilmesini istemiyorsak "final" keyword'unu kullanırız.
		return tutar * 1.18;	
		
	}

}
