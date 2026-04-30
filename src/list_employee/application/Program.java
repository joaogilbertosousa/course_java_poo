package list_employee.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import list_employee.entities.Employee;

public class Program {

	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		IO.print("How many employees will be registered? ");
		int numberOfEmployees = sc.nextInt();

		IO.println();

		for (int i = 0; i < numberOfEmployees; i++) {

			IO.println("Emplyoee #" + (i + 1) + ":");
			IO.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			IO.print("Name: ");
			String name = sc.nextLine();
			IO.print("Salary: ");
			Double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
			IO.println();

		}

		IO.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			IO.println("This id does not exist!");
		} else {
			IO.print("Enter the percentage: ");
			double tax = sc.nextDouble();
			for (Employee x : list) {
				if (x.getId() == id) {
					x.increaseSalary(tax);
				}
			}
		}

		IO.println();
		IO.println("List of employees:");
		for (Employee x : list) {
			IO.print(x);
		}
		sc.close();

	}

}
