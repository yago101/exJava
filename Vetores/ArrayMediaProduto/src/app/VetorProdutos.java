package app;

import java.util.Locale;
import java.util.Scanner;

public class VetorProdutos{
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		//declarando arrays e as demais variaveis
		double[] precos;
		String[] produtos;
		int qtdItens;
		double media = 0;
		
		//entrada de dados
		System.out.println("Por favor, digite a quantidade de produtos: ");
		qtdItens = tc.nextInt();
		
		precos= new double[qtdItens];
		produtos= new String[qtdItens];
		
		for(int i = 0; i <produtos.length;i++) {
			System.out.println("Digite o nome do "+ (i+1) + "° produto:");
			tc.nextLine();
			produtos[i]= tc.nextLine();
			System.out.println("Digite o valor do produto: ");
			precos[i]=tc.nextDouble();
			
		}
		//calcula da média
		for(int i = 0 ; i < precos.length;i++) {
			media = media + precos[i];
		}
		media = media/qtdItens;
		tc.close();
		System.out.printf("AVERAGE PRICE: %.2f",media);
	}
}