package currency_converter.util;

public class CurrencyConverter {

	public static final double IOF = 1.06;

	public static double realConverter(double price, double quantity) {
		return price * quantity * IOF;
	}

}
