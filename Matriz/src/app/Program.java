package app;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		int matrizSize;
		int countNegative = 0;

		System.out.println("Write the matriz size: ");
		matrizSize = tc.nextInt();

		int[][] matriz = new int[matrizSize][matrizSize];

		for (int line = 0; line < matrizSize; line++) {
			for (int column = 0; column < matrizSize; column++) {
				matriz[line][column] = tc.nextInt();
			}
		}
		System.out.println("\nYou did this matriz: \n");
	
		for (int outLine = 0; outLine < matriz.length; outLine++) {
			for (int outColumn = 0; outColumn < matrizSize; outColumn++) {
				System.out.print("     "+matriz[outLine][outColumn]);
				if (outColumn == (matrizSize-1)){
					System.out.print("\n");
				}
				if(matriz[outLine][outColumn] <0) {
					countNegative += 1;
				}
			}
		}
		System.out.println("Main diagonal: ");
		for(int outDiagLine = 0,outDiagColumn = 0;outDiagLine<matriz.length;outDiagLine++,outDiagColumn++) {
			System.out.print(matriz[outDiagLine][outDiagColumn]+" ");
		}
		System.out.print("\nNegative numbers: "+ countNegative);
		tc.close();
	}
}