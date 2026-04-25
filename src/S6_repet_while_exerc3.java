void main() {

	Scanner sc = new Scanner(System.in);

	int alcohol = 0;
	int gasoline = 0;
	int diesel = 0;

	int x = sc.nextInt();

	while (x != 4) {
		if (x == 1)
			alcohol++;
		else if (x == 2)
			gasoline++;
		else if (x == 3)
			diesel++;

		x = sc.nextInt();
	}

	System.out.println("THANK YOU");
	System.out.println("Alcohol: " + alcohol);
	System.out.println("Gasoline: " + gasoline);
	System.out.println("Diesel: " + diesel);

	sc.close();

}
