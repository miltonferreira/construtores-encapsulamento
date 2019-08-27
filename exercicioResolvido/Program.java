package exercicioResolvido;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		show("Enter account number: ");
		int number = sc.nextInt();
		
		show("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		show("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			
			show("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			
		}else {
			
			account = new Account(number, holder);
			
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		
		show("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		
		show("Enter a withdraw value: ");
		double amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
		
		sc.close();
	}
	
	static void show(String str) {
		System.out.print(str);
	}

}
