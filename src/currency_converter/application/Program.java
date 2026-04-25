package currency_converter.application;

import java.util.Locale;
import java.util.Scanner;

import currency_converter.util.CurrencyConverter;

public class Program {

	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Whar is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.realConverter(price, dollar));

		sc.close();

	}
}
