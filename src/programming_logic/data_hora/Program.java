package programming_logic.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	void main() {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		Instant d10 = Instant.now();
		
		IO.println();
		IO.print("Day (dd): ");
		int dd = sc.nextInt();
		IO.print("Month (mm): ");
		int mm = sc.nextInt();
		IO.print("Year (yyyy): ");
		int yy = sc.nextInt();
		LocalDate birth = LocalDate.of(yy, mm, dd);
		IO.println();
		
		IO.println("d01 = " + d01);
		IO.println("d02 = " + d02);
		IO.println("d03 = " + d03);
		IO.println("d04 = " + d04);
		IO.println("d05 = " + d05);
		IO.println("d06 = " + d06);
		IO.println("d07 = " + d07);
		IO.println("d08 = " + d08);
		IO.println("d09 = " + d09);
		
		IO.println();
		IO.println("Date od Birth = " + birth.format(fmt1));
		IO.println("Date od Birth = " + fmt1.format(birth));
		IO.println("Date od Birth = " + birth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		IO.println();
		IO.println("d10 = " + fmt3.format(d10));
		IO.println("d11 = " + fmt3.format(LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault())));
		
		
		sc.close();
		
	}
}
