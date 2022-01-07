package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Arrays18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		int[] idades = new int[10];
		for (int i = 0; i < idades.length; i++) {
			System.out.print("Entre com a idades da pessoa: ");
			idades[i] = scan.nextInt();
		}
		
		
		int menorIdade = idades[0];
		int indexMenor = 0;
		int maiorIdade = idades[0];
		int indexMaior = 0;
		
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indexMaior = i + 1;
			} else if (idades[i] < menorIdade){
				menorIdade = idades[i];
				indexMenor = i + 1;
			}
		}
		System.out.println();
		System.out.println("************lista************");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");

		}
		System.out.println();
		System.out.println("Menor idade é " + menorIdade + " e está na posição " + indexMenor);
		
		System.out.println();
		System.out.println("Maior idade  é " + maiorIdade + " e está na posição " + indexMaior);
		

	}

}
