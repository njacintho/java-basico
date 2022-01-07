package br.com.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {
	public static void main(String[] args) {
		// Program que veja se o número é didvido por 7
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero:");
		int num = scan.nextInt();

		System.out.println("Entre com um limite");
		int max = scan.nextInt();

		// quando você quer somente o primeiro valor e sai do laço pelo break
		/*
		 * for (int i = num; i <= max; i++) { //System.out.println(i); if (i % 7 == 0) {
		 * System.out.println("Valor de i é: " + i); break; }
		 */
		
		
		// nesse exemplo ele vai pular sempre que for multiplo de 7.
		// vai continuar o for - continue
		
		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("Valor de i é: " + i);
		}
	}

}
