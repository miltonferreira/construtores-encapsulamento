package exercicio;

import java.util.Scanner;

public class Bank {

	private String name;
	private int account;
	private double value;
	private double tax = 5.00;
	
	void addAccount() {

		Scanner sc = new Scanner(System.in);

		show("Enter account number: ");
		int n = sc.nextInt();
		setAccount(n);

		show("Enter account holder: ");
		sc.nextLine();
		String c = sc.nextLine();
		setName(c);

		show("Is there na initial deposit (y/n)? ");
		char ch = sc.next().charAt(0);

		System.out.println();

		if (ch == 'y') {

			show("Enter initial deposit value: ");
			// addValue(sc.nextDouble());
			double initialDeposit = sc.nextDouble();
			deposit(initialDeposit);


		} else {

			updateAccount();
		}

		//sc.close(); //*** Acontece erro quando é preciso usar mais de uma vez

	}
	
	void deposit(double value) {
		addValue(value);
		updateAccount();
	}
	
	void withdraw(double value) {
		removeValue(value);
		updateAccount();
	}
	
	void updateAccount() {
		
		System.out.println();
		System.out.println("Account data");
		System.out.println("Account: " + account + ", Holder: " + name + ", Balance: $ " + value);
		
	}
	
	private void addValue(double value) {
		this.value += value;
	}
	private void removeValue(double value) {
		this.value -= value + tax;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getValue() {
		return value;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	private void show(String str) {
		System.out.print(str);
	}
	
}
