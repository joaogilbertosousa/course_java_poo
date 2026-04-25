package programming_logic;

import java.util.Scanner;

public class S5_condicion_exerc2 {
	void main() {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if (number % 2 != 0)
			System.out.println("IMPAR");
		else
			System.out.println("PAR");

		sc.close();

	}
}
