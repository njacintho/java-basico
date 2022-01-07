package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Arrays17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];
		int qtdPwssoaSup35 = 0;

		for (int i = 0; i < idades.length; i++) {
			System.out.print("Entre com as idades: ");
			idades[i] = scan.nextInt();
		}
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > 35) {
				qtdPwssoaSup35++;
			}
		}
		System.out.println();
		System.out.println("************lista************");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");

		}
		System.out.println();
		System.out.println("************Pares************");
		System.out.println("Na lista tem " + qtdPwssoaSup35 + " pessoas com mais de 35 anos");

	}

}
