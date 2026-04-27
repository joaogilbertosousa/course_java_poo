package programming_logic.vect_product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	void main() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		Product[] vectProduct = new Product[sc.nextInt()];
		
		double sum = 0.0;
		for(int i = 0; i < vectProduct.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vectProduct[i] = new Product(name, price);
			sum += vectProduct[i].getPrice();
		}
		
		double avg = sum / vectProduct.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
		
	}

}
