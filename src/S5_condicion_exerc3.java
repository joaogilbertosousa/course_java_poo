void main() {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int x = sc.nextInt();
	int y = sc.nextInt();

	if (x % y == 0 || y % x == 0)
		System.out.println("SÃO MULTIPLOS");
	else
		System.out.println("NÃO SÃO MULTIPLOS");

	sc.close();

}
