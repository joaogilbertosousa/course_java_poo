package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S4_sequenc_exerc2 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double r = sc.nextDouble();
		double area = pi * Math.pow(r, 2);

		System.out.printf("A = %.4f%n", area);

		sc.close();
	}
}
