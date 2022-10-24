package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		/*WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.gameOver();*/
		
		
		GameCalculator[] gameCalculators = new GameCalculator[] {new ManGameCalculator(), new WomanGameCalculator (), new KidsGameCalculator(),new OlderGameCalculator()};
		for (GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.gameOver();
			gameCalculator.hesapla();
			
		}
	}

}

//array kullanmadan da yazabiliriz ama bu defa GameCalculator 4 farklı şekilde referans edilebildiği için her bir oyuncu türünü ayrı ayrı new'leyebiliriz.