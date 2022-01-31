package br.com.cursojava.exerciciosMatriz;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite um numero inteiro -> ");
		int valor = leitor.nextInt();

		for (int i = valor; i <= valor+11; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
	
			}
			
		}
	}

}
