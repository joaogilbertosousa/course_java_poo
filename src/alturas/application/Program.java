package alturas.application;

import java.util.Locale;
import java.util.Scanner;

import alturas.entities.Pessoas;

public class Program {

	void main() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		IO.print("Quantas pessoas serao digitadas? ");
		Pessoas[] vect = new Pessoas[sc.nextInt()];
		
		double soma = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			IO.println("Dados da " + (i+1) + "a pessoa:");
			IO.print("Nome: ");
			String nome = sc.nextLine();
			IO.print("Idade: ");
			int idade = sc.nextInt();
			IO.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoas(nome, idade, altura);
			soma += vect[i].getAltura();
			
		}
		
		double alturaMedia = soma / vect.length;
		
		IO.print(vect[0]);
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) System.out.println(vect[i].getNome());
		}
		
		sc.close();
		
	}
}
