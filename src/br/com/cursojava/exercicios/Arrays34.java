package br.com.cursojava.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um n�emro no Vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		 
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analisando o n�emro: " + vetorA[i]);
			
			for (int j = 1; j <= vetorA[i]; j++) {
				
				if (vetorA[i] % j == 0) {
					System.out.println(j + " .� divisor");
				}
			}
		}
		System.out.println();
	}
}
