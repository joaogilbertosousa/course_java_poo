package programming_logic.matrix;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int negativeNumber = 0;
		IO.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			IO.print(mat[i][i] + " ");
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negativeNumber++;
				}
			}
		}

		IO.println();
		IO.print("Negative Numbers = " + negativeNumber);

		sc.close();

	}
}
