package exercicio;

public class program {

	public static void main(String[] args) {

		Bank b1 = new Bank();
		Bank b2 = new Bank();

		b1.addAccount();

		b1.updateAccount();

		b1.deposit(200.00);

		b1.withdraw(300.00);
		

		b2.addAccount();

		b2.updateAccount();

		b2.deposit(200.00);

		b2.withdraw(198.00);
		
		System.out.println("B1: " + b1.getName());
		System.out.println("B2: " + b2.getName());

	}

}
