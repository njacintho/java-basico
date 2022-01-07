package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];

		double[] vetorB = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		
		}
		System.out.println("*************Primeira lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		DecimalFormat df = new DecimalFormat("###,###.###");
		System.out.println();
		System.out.println("*************Segunda lista raíz quadrada************");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}

	}

}
