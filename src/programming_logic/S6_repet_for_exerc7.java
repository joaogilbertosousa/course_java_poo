package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S6_repet_for_exerc7 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int x = i * i;
			int y = i * i * i;

			System.out.printf("%d %d %d%n", i, x, y);

		}

		sc.close();

	}
}
