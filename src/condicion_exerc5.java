void main() {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int code = sc.nextInt();
	int quantity = sc.nextInt();

	double amount;
	if (code == 1)
		amount = quantity * 4.00;
	else if (code == 2)
		amount = quantity * 4.50;
	else if (code == 3)
		amount = quantity * 5.00;
	else if (code == 4)
		amount = quantity * 2.00;
	else if (code == 5)
		amount = quantity * 1.50;
	else
		amount = 0;

	System.out.printf("AMOUNT: R$ %.2f%n", amount);

	sc.close();

}
