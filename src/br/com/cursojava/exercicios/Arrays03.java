package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];

		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		System.out.println("*************Primeira lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();
		System.out.println("*************Segunda lista é a listaA ao quadrado************");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
