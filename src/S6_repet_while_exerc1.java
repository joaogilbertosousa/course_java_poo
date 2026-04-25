void main() {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Type the password: ");
	int password = sc.nextInt();
	
	while(password != 2002) {
		System.out.println("Invalid Password!");
		System.out.print("Type the password again: ");
		password = sc.nextInt();
	}
	
	System.out.println("Access Allowed!");
	
	sc.close();

}
