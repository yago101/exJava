package application;
import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class App{
	public static void main (String[]args) {
		int nConta;
		double vOperacoes;
		String nTitular;
		char respDepInicial;
		Conta c1;
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		//entrada de dados
		System.out.print("Enter account number: ");
		nConta = teclado.nextInt();
		System.out.print("Enter account holder: ");
		teclado.nextLine();
		nTitular = teclado.nextLine();
	
		System.out.print("Is there an initial deposit (y/n)? ");
		 respDepInicial = teclado.next().toLowerCase().charAt(0);
		 
		//Criando objeto conta de acordo com a resposta
		if(respDepInicial =='y') {
			System.out.print("Enter inicial deposit value: ");
			vOperacoes = teclado.nextDouble();
			c1 = new Conta(nConta, nTitular, vOperacoes);
		
			
		}else if(respDepInicial == 'n') {
			c1 = new Conta(nConta, nTitular);
			
		}else {
			System.out.println("opção invalida");
		}
		
		c1.status();
		System.out.print("Enter a deposit value: ");
		vOperacoes = teclado.nextDouble();
		c1.depositar(vOperacoes);
		System.out.print("Enter a withdraw value: ");
		vOperacoes = teclado.nextDouble();
		c1.sacar(vOperacoes);
		teclado.close();
	}
}