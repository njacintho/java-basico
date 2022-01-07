package br.com.cursojava.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um núemro no Vetor A: ");
			vetorA[i] = scan.nextInt();

		}

		System.out.print("Tabuada ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("***************");
			System.out.println(vetorA[i] + " ");
			

			for (int i1 = 0; i1 <= 10; i1++) {
				int result = vetorA[i] * i1;
				System.out.println(vetorA[i] + " X " + i1 + " = " + result);
			}
		}
		System.out.println();
	}
}
