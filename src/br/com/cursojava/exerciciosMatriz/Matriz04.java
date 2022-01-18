package br.com.cursojava.exerciciosMatriz;

import java.util.Scanner;

public class Matriz04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[][] numeros = new int[3][3];
		int somaPares = 0;
		int somaImpares = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Entre com o número : ");
				numeros[i][j]= scan.nextInt();
	
				if (numeros[i][j] % 2 == 0) {
					somaPares++;
				} else {
					somaImpares++;
				}
			}
		}
		System.out.println("Soma total Pares = " + somaPares);
		System.out.println("Soma total Impares = " + somaImpares);
	}

}
