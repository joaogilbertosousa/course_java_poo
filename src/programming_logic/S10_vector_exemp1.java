package programming_logic;

import java.util.Locale;
import java.util.Scanner;

public class S10_vector_exemp1 {

	void main() {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vect = new double[sc.nextInt()];
		
		double sum = 0;
			
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", avg);
		
		sc.close();
		
		
	}
	
}
