package account.application;

import java.util.Locale;
import java.util.Scanner;

import account.entities.Account;

public class Program {
	
	void main() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		IO.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		IO.print("Enter account holder: ");
		String holder = sc.nextLine();
		IO.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			IO.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		IO.println();
		IO.println("Account data:");
		IO.print(account);
		
		IO.println();
		IO.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		IO.println();
		IO.println("Updated account data: ");
		IO.print(account);
		
		IO.println();
		IO.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		IO.println();
		IO.println("Updated account data: ");
		IO.print(account);
		
		sc.close();
		
	}

}
