package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] idadesA = new int[5];

		int[] idadesB = new int[idadesA.length];

		for (int i = 0; i < idadesA.length; i++) {
			System.out.print("Entre com a idade: ");
			idadesA[i] = scan.nextInt();
			idadesB[i] = idadesA[i];
		}
		System.out.println("*************Primeira lista************");
		for (int i = 0; i < idadesA.length; i++) {
			System.out.print(idadesA[i] + " ");

		}
		System.out.println();
		System.out.println("*************Segunda lista************");
		for (int i = 0; i < idadesB.length; i++) {
			System.out.print(idadesB[i] + " ");
		}

	}
}
