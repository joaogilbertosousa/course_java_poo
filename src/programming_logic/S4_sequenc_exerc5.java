package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S4_sequenc_exerc5 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//int code1 = sc.nextInt();
		int quantity1 = sc.nextInt();
		double price1 = sc.nextDouble();

		//int code2 = sc.nextInt();
		int quantity2 = sc.nextInt();
		double price2 = sc.nextDouble();

		double amount = quantity1 * price1 + quantity2 * price2;

		System.out.printf("AMOUNT TO PLAY: R$ %.2f%n", amount);

		sc.close();
	}
}
