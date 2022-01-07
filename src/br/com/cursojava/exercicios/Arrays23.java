package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		int cont = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um núemro: ");
			vetorA[i] = scan.nextInt();
		}

		boolean palindromo = true;
		for(int i = 0; i < (vetorA.length/2); i++) {
			if(vetorA[i] != vetorA[vetorA.length  - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if(palindromo) {
			System.out.println("É um palindromo");
		}else {
			System.out.println("Não é um palindromo");
		}

	}
}
