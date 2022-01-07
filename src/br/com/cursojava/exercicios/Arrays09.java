package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Arrays09 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		int[] vetorB = new int[vetorA.length];

		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero para vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		System.out.println();
		System.out.println("*************Segunda lista***********");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Entre com um numero para vetor B: ");
			vetorB[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i] = vetorA[i] /(float) vetorB[i];
		}

		System.out.println();
		System.out.println("*************Primeira lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}

		System.out.println();
		System.out.println("*************Segunda lista***********");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.println();
		System.out.println();
		System.out.println("*************A soma das listas***********");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(df.format(vetorC[i]) + " ");
		}

	}

}
