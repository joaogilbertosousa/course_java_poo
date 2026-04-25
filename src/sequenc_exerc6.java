void main() {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double pi = 3.14159;

	double triangle = a * c / 2.0;
	double circle = pi * Math.pow(c, 2.0);
	double trapeze = (a + b) * c / 2.0;
	double quadratic = b * b;
	double rectangle = a * b;

	System.out.printf("TRIANGLE: %.3f%n", triangle);
	System.out.printf("CIRCLE: %.3f%n", circle);
	System.out.printf("TRAPEZE: %.3f%n", trapeze);
	System.out.printf("QUADRATIC: %.3f%n", quadratic);
	System.out.printf("RECTANGLE: %.3f%n", rectangle);

	sc.close();

}
