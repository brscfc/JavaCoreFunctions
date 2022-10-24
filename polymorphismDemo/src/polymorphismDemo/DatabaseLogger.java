package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {		//Overriding Extend eden clastaki imzayı extend edilen classlarda
	public void log(String message) {					//tekrar yazmak yani üzerine yazmaktır. Ortak değer içeren classlardan birine farklı bir kod yazılacaksa
		System.out.println("Logged to database :" + message);  //Overriding yöntemi ile değişiklik istenilen class revize edilir.
	}

}
