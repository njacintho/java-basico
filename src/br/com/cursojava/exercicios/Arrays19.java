package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] nota1 = new double[10];

		double[] nota2 = new double[nota1.length];

		double[] result = new double[nota1.length];

		for (int i = 0; i < nota1.length; i++) {
			System.out.print("Entre com a primeira nota: ");
			nota1[i] = scan.nextDouble();
		}

		System.out.println();
		System.out.println("*************Segunda lista***********");
		for (int i = 0; i < nota2.length; i++) {
			System.out.print("Entre com a segunda nota: ");
			nota2[i] = scan.nextDouble();
		}

		for (int i = 0; i < nota2.length; i++) {
			result[i] = (nota1[i] + nota2[i]) / 2;
			if(result[i] >= 7) {
				System.out.println("Sua média é " + result[i] + ", você foi aprovado");
			}else {
				System.out.println("Sua média é " + result[i] + ", você foi reprovado");
			}
			
		}


	}

}
