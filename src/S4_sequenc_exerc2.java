void main() {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	double pi = 3.14159;
	double r = sc.nextDouble();
	double area = pi * Math.pow(r, 2);

	System.out.printf("A = %.4f%n", area);

	sc.close();
}
