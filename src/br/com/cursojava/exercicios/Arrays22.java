package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		int cont = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um núemro: ");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 == 0) {
				cont++;
			}else {
				break;
			}
			
		}

		System.out.println("************Numero pares*************");
		System.out.println("tem " + cont + " pares.");

	}
}
