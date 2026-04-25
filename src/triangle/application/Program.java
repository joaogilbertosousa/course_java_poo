package triangle.application;

import java.util.Locale;
import java.util.Scanner;

import triangle.entities.Triangle;

public class Program {

	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		IO.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		IO.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());
		if(x.area() > y.area()) IO.print("Larger area: X");
		else IO.print("Larger area: X");

	}
}
