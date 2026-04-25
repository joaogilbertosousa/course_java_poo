package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S6_repet_while_exerc2 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("First");
			} else if (x < 0 && y > 0) {
				System.out.println("Second");
			} else if (x < 0 && y < 0) {
				System.out.println("Third");
			} else {
				System.out.println("fourth");
			}

			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();

	}
}
