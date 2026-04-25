package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S6_repet_for_exerc5 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fatorial = 1;

		for (int i = n; i >= 1; i--) {

			fatorial *= i;

		}

		System.out.println(fatorial);

		sc.close();

	}
}
