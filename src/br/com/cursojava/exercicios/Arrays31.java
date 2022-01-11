package br.com.cursojava.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um n�emro no Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		System.out.print("Tabuada ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("***************");
			System.out.println("Tabuada de " + vetorA[i]);

			for (int j = 0; j <= 10; j++) {
				int result = vetorA[i] * j;
				System.out.println(vetorA[i] + " X " + j + " = " + result);
			}
		}
		System.out.println();
	}
}
