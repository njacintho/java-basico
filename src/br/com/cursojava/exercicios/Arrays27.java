package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um n�emro no Vetor A: ");
			vetorA[i] = scan.nextInt();
			
			vetorB[vetorA.length - i -1] = vetorA[i];
		}
		
		
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	

	}
}
