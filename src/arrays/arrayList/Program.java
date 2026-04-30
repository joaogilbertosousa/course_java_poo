package arrays.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	void main() {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("João");
		list.add("Marcos");
		list.add("Marcelo");
		list.add("Anna");
		list.add(2, "Carol");

		for (String x : list) {
			IO.println(x);
		}
		
		IO.println("----------------------------");
		list.removeIf(x -> x.charAt(0) == 'A');

		for (String x : list) {
			IO.println(x);
		}
		
		IO.println("----------------------------");
		IO.println("Index of João: " + list.indexOf("João"));
		IO.println("Index of Bob: " + list.indexOf("Bob"));
		
		IO.println("----------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for (String x : result) {
			IO.println(x);
		}
		
		IO.println("----------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'W').findFirst().orElse(null);
		IO.println(name);
		
	}
}
