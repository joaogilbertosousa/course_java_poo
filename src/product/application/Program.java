package product.application;

import java.util.Locale;
import java.util.Scanner;

import product.entities.Product;

public class Program {

	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		IO.println("Enter product data:");
		IO.print("Name: ");
		product.name = sc.nextLine();
		IO.print("Price: ");
		product.price = sc.nextDouble();
		IO.print("Quantity in stok: ");
		product.quantity = sc.nextInt();

		IO.println();
		IO.println("Product data: " + product);

		IO.println();
		IO.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());

		IO.println();
		IO.println("Updated data: " + product);

		IO.println();
		IO.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());

		IO.println();
		IO.println("Updated data: " + product);

		sc.close();

	}
}
