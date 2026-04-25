package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S5_condicion_exerc8 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double incomeTax;
		double salary = sc.nextDouble();

		if (salary <= 2000.0)
			incomeTax = 0.0;

		else if (salary <= 3000.00)
			incomeTax = (salary - 2000.00) * 0.08;

		else if (salary <= 4500.00)
			incomeTax = (salary - 3000.0) * 0.18 + 1000.00 * 0.08;

		else
			incomeTax = (salary - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;

		if (incomeTax == 0.00)
			System.out.println("Isento");

		else
			System.out.printf("%.2f%n", incomeTax);

		sc.close();

	}
}
