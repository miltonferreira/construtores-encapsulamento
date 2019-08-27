package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import encapsulamento.Product;

public class Program {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		Product product2 = new Product("TV Plana", 1200.00);
		product2.setName("Computador");
		
		show("Nome: " + product2.getName() + " Price: " + product2.getPrice() + " Quantity: " + product2.getQuantity());
		
		sc.close();
	}
	
	public static void show(String str) {
		System.out.println(str);
	}
}
