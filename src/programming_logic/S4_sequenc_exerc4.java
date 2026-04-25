package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S4_sequenc_exerc4 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		int workedHours = sc.nextInt();
		double hourlyRate = sc.nextDouble();

		double salary = (double) workedHours * hourlyRate;

		System.out.printf("NUMBER = %d%n", id);
		System.out.printf("SALARY = U$ %.2f%n", salary);

		sc.close();
	}
}