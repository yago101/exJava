package app;

import java.util.Locale;
import java.util.Scanner;

public class Vetor{
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		int qtdPessoas;
		double media = 0;
		
		
		System.out.print("Digite a quantidade de pessoas: ");
		qtdPessoas = teclado.nextInt();
		
		double[] arranjo = new double[qtdPessoas];
		
		for(int i=0; i< arranjo.length;i++) {
			System.out.println("Digite o "+(i+1) +" tamanho:");
			arranjo[i] = teclado.nextDouble();
			media = (media + arranjo[i]);
		}
		media = (media/qtdPessoas);
		teclado.close();
		System.out.printf("AVERAGE HEIGHT = %.2f", media);
		}
	}
