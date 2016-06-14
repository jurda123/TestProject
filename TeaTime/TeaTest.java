package TeaTime;

import TeaTime.Tea.Flavour;

public class TeaTest {
	public static void main(String[] args) {

		Tea[] teas = { new Tea(), new Tea(Flavour.GINGER),
				new Tea(Flavour.LEMON), new Tea(), new Tea(Flavour.MINT) };
		
		Beverage[] wines = { new Wine(), new Wine(1958,"France"),
				new Wine(1968), new Wine("Belgium"), new Wine(1944,"Bulgaria") };

		TeaTest teaTest;
		teaTest = new TeaTest();
		teaTest.drinkTea(teas);
		
		teaTest.drinkWines(wines);


//		teaTest.compareTeas(teas[0], teas[3]);
//		teaTest.compareTeas(teas[0], teas[0]);
//		teaTest.compareTeas(teas[4], teas[3]);

	}

	public void drinkTea(Tea[] teas) {

		for (Tea tea : teas) {
			tea.drink();
		}
	}
	public void drinkWines(Beverage[] wine) {

		for (Beverage wines : wine) {
			wines.drink();
		}
	}

	public void compareTeas(Tea tea1, Tea tea2) {
		if (tea1.equals(tea2)) {
			System.out.println("tea " + tea1.toString(tea1.getFlavour())
					+ " equals " + tea1.toString(tea2.getFlavour()));
		} else {
			System.out.println("tea " + tea1.toString(tea1.getFlavour())
					+ " does not equal " + tea1.toString(tea2.getFlavour()));
		}

	}

}
