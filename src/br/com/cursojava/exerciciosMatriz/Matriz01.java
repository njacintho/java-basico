package br.com.cursojava.exerciciosMatriz;

import java.util.Random;

public class Matriz01 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		Random numeroRandomico = new Random();
		int maior = 0;
		int linha = 0;
		int colna = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandomico.nextInt(100);
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					colna = j;
				}
			}
			System.out.println();
		}

		System.out.println("O número maior é " + maior + " que está na linha " 
		+ linha + "  e coluna " + colna);
	}

}
