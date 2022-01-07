package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Arrays14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int qtdImpares = 0;
		double media = 0;
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero para vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				qtdImpares++;
			}
		}
	
		media =  soma / (float) qtdImpares;
		
		System.out.println();
		System.out.println("************lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.println();
		System.out.println("************A media************");
		System.out.println("A media dos numeros impares é " + df.format(media));
		
	}

}
