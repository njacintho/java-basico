package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Arrays16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int somaInferior15 = 0;
		int qtdIguais15 = 0;
		int somaSuperior15 = 0;
		int cont = 0;
		

		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero para vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] < 15) {
				somaInferior15 += vetorA[i];
			}else if (vetorA[i] == 15){
				qtdIguais15++;
			}else if(vetorA[i] > 15) {
				somaSuperior15 += vetorA[i];
				cont++;
			}
		
		}
	
		double media = somaSuperior15 / (float) cont;

		System.out.println();
		System.out.println("************lista************");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();
		System.out.println("***********Soma dos elementos menor que 15************");
		System.out.println("a soma é " + somaInferior15);
		
		System.out.println();
		System.out.println("***********quantidade de elementos iguais a 15************");
		System.out.println("quantidade de iguais a 15 é  " + qtdIguais15);
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.println();
		System.out.println("**********Media de elementos maiores que 15************");
		System.out.println("sua soma é  "+ somaSuperior15 + " e sua média é " + df.format(media));
	}

}
