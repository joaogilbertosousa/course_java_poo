package negativos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	void main() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		IO.print("Quantos números você vai digitar: ");
		
		int[] vect = new int[sc.nextInt()];
		
		for(int i = 0; i < vect.length; i++) {
			IO.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		IO.println("NÚMEROS NEGATIVOS:");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) IO.println(vect[i]);
		}
		
		
		sc.close();
		
		
		
	}
}
