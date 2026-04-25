void main() {

	Scanner sc = new Scanner(System.in);

	int in = 0;
	int out = 0;

	int n = sc.nextInt();

	for (int i = 1; i <= n; i++) {
		int x = sc.nextInt();
		if (x >= 10 && x <= 20)
			in++;
		else
			out++;
	}

	System.out.println(in + " in");
	System.out.println(out + " out");

	sc.close();

}
