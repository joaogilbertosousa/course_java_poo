package programming_logic;

import java.util.Scanner;

public class S5_condicion_exerc1 {
	void main() {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if (number < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("NÃO NEGATIVO");

		sc.close();

	}
}
