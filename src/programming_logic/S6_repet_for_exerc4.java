package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S6_repet_for_exerc4 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("Divisão Impossível");
			}

			else {
				double division = (double) x / y;
				System.out.printf("%.1f%n", division);
			}
		}

		sc.close();

	}
}
