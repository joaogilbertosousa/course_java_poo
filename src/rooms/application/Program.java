package rooms.application;

import java.util.Locale;
import java.util.Scanner;

import rooms.entities.Student;

public class Program {

	void main() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] vect = new Student[10];
		
		IO.print("How many rooms will be rented? ");
		int numberOfRooms = sc.nextInt();
		
		for(int i = 0; i < numberOfRooms; i++) {
			sc.nextLine();
			IO.println("Rent #" + (i + 1) + ":");
			IO.print("Name: ");
			String name = sc.nextLine();
			IO.print("Email: ");
			String email = sc.nextLine();
			IO.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Student(name, email, room);
			IO.println();
						
		}
		
		IO.println("Busy rooms:");
		
		for(int i = 0; i < vect.length; i++) {
			
			if(vect[i] != null) IO.println(vect[i]);
			
		}
		
		sc.close();
		
	}
}
