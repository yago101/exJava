package app;

import java.util.Scanner;

import entities.Estudante;

public class App{
	public static void main(String[]args) {
		int qtLocacao = 0,numQuarto;
		String no,em;
		
		
		Scanner tc = new Scanner(System.in);
	
		
		Estudante arrayQuartos[] = new Estudante[10];
		
		System.out.print("How many rooms will be rented? ");
		qtLocacao = tc.nextInt();
		
		
		for(int i = 0 ; i< qtLocacao;i++) {
			System.out.println("\nRent #"+(i+1)+" :");
			System.out.print("Name: ");
			tc.nextLine();
			no = tc.nextLine();
			
			System.out.print("eMAIL: ");
			em = tc.nextLine();
			System.out.print("Room: ");
			numQuarto = tc.nextInt();
			
			arrayQuartos[numQuarto] = new Estudante(no,em,numQuarto);
			
		}
		System.out.println("Busy roms: ");
	
		for(int i = 0 ; i<arrayQuartos.length;i++) {
			if(arrayQuartos[i] !=null) {
		System.out.println(arrayQuartos[i].toString());
		}
		}
		
		tc.close();
	}
}