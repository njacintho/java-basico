package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
		
		}
		System.out.println("*************Primeira lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();
		System.out.println("*************Segunda lista multiplicada pelo indice************");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
