package app;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[]args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//entrada de dados
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		
		Client cl = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order? ");
		int nItemsOrder = sc.nextInt();
		sc.nextLine();
		Order or = new Order(new Date(),OrderStatus.PROCESSING, cl);
		for(int i = 0; i<nItemsOrder;i++) {
			System.out.println("Enter #"+(i+1)+" item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			Product pdt = new Product(productName, productPrice);
			OrderItem ordItem = new OrderItem(quantity, pdt);
			or.addItem(ordItem);
			
		}
		System.out.println("\n"+or.toString());
		
		sc.close();
		
	}
}