package br.com.cursojava.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		boolean primos;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um n�emro no Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		System.out.println("Teste os numeros se s�o primos: ");

		for (int i = 0; i < vetorA.length; i++) {
			primos = true;
			if(vetorA[i] == 2) {
				System.out.println(vetorA[i] + " .� primo.");
			}
			for (int j = 2; j < vetorA[i]; j++) {
				System.out.println("***************");
				 if (vetorA[i] % j == 0) {
					primos = false;
					System.out.println(vetorA[i] + " .N�o � primo.");
					break;
				} else {
					System.out.println(vetorA[i] + " .� primo.");
					break;
				}
			}
		}
	}
}
