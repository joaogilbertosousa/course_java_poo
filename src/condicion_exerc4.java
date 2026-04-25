void main() {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int x = sc.nextInt();
	int y = sc.nextInt();
	int duracao;

	if (x < y)
		duracao = y - x;
	else
		duracao = 24 - x + y;

	System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

	sc.close();

}
