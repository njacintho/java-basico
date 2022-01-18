package br.com.cursojava.exerciciosMatriz;

import java.util.Random;

public class Matriz02 {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		Random numeroRandomico = new Random();
		int maiorL5 = 0;
		int maiorC7 = 0;
		int menorL5 = Integer.MAX_VALUE;
		int menorC7 = Integer.MAX_VALUE;


		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandomico.nextInt(20);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < matriz[5].length; i++) {

			if (matriz[5][i] > maiorL5) {
				maiorL5 = matriz[5][i];
			}
			if (matriz[5][i] < menorL5) {
				menorL5 = matriz[5][i];
			}
		}
		
		for (int i = 0; i < matriz[7].length; i++) {

			if (matriz[i][7] > maiorC7) {
				maiorC7 = matriz[i][7];
			}
			if (matriz[i][7] < menorC7) {
				menorC7 = matriz[i][7];
			}
		}
		System.out.println();
		System.out.println("O número maior da linha 5 é  " + maiorL5 + " e o menor é " + menorL5);

		System.out.println("O número maior da coluna 7 é  " + maiorC7 + " e o menor é " + menorC7);

	}

}
