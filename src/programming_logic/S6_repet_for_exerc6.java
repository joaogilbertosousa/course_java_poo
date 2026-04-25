package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S6_repet_for_exerc6 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}
}
