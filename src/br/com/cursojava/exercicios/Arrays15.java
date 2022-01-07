package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Arrays15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int qtdPares = 0;
		int qtdImpares = 0;
		int porPares = 0;
		int porImpares = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero para vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
			}else {
				qtdImpares++;
			}
			porPares = (100 * qtdPares) / vetorA.length;
			porImpares = (100 * qtdImpares) / vetorA.length;
		}
	

		System.out.println();
		System.out.println("************lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();
		System.out.println("************Pares************");
		System.out.println("A lista tem " + qtdPares + " numeros pares que  equivale a " + porPares + "% dos numeros da lista.");
		
		System.out.println();
		System.out.println("************Impares************");
		System.out.println("A lista tem " + qtdImpares + " numeros impares que equivale a " + porImpares + "% dos numeros da lista.");

	}

}
