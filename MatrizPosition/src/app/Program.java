package app;

import java.util.Scanner;

public class Program{
	public static void main(String []args) {
		
		int amountLine, amountColumn;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Write amount lines do you want: ");
		amountLine = tc.nextInt();
		
		System.out.println("Now, write amount columns do you want:");
		amountColumn = tc.nextInt();
		
		int [][] matriz = new int[amountLine][amountColumn];
		
		System.out.println("Please, enter the matriz numbers:");
		
		for(int l = 0; l<amountLine;l++) {
			for(int c = 0; c<amountColumn;c++) {
				matriz [l][c] = tc.nextInt();
			}
		}
		
		tc.close();
	}
}