void main() {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();

	int difference = a * b - c * d;

	System.out.printf("DIFFERENCE = %d%n", difference);

	sc.close();
}
