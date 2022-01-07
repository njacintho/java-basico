package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		int[] vetorB = new int[vetorA.length];

		int[] vetorC = new int[vetorA.length];

		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero para vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("*************Segunda lista***********");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Entre com um numero para vetor B: ");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] + vetorB[i];

		}
		System.out.println();
		System.out.println("*************Primeira lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		
		System.out.println();
		System.out.println("*************Segunda lista***********");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("*************A soma das listas***********");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
