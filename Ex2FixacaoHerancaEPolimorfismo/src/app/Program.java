package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[]args) throws ParseException {
		Product pd = null;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int numProducts = sc.nextInt();
		
		for(int i = 0; i<numProducts; i++) {
			System.out.print("Product #"+(i+1)+" data:");
			System.out.print("\nCommon, used or imported (c/u/i)? ");
			char resp = sc.next().toLowerCase().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(resp =='c') {
				 pd = new Product(name, price);
			}else if (resp=='u') {
				System.out.print("Manufacture data (DD/MM/YYY): ");
				String manuDate = sc.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

				pd = new UsedProduct(name, price, sdf.parse(manuDate));
			}else if(resp=='i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				pd = new ImportedProduct(name, price, customsFee);
			}
			productList.add(pd);
		}
		
		System.out.print("\nPRICE TAGS:");
		
		for(Product pdOut : productList) {
			System.out.print("\n"+pdOut.priceTag());
		}
		
		sc.close();
	}

}
