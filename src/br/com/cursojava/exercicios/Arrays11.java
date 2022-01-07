package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Arrays11 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int qtdPares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero para vetor A: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
			}
		}
		
		System.out.println();
		System.out.println("************lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();
		System.out.println("************lista************");
		System.out.println("A lista tem " + qtdPares + " numeros pares ");
		
	}

}
