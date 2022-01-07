package br.com.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Arrays20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] real = new double[20];
		double cotacao;

		System.out.print("Entre com o valor da cota��o do d�lar: ");
		cotacao = scan.nextDouble();
		
		for (int i = 0; i < real.length; i++) {
			real[i] = cotacao * (i + 1);
		}

		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.println();
		System.out.println("*************Conver�o para real at� 20 ************");
		for (int i = 0; i < real.length; i++) {
			System.out.print(df.format(real[i]) + "  ");
		}

	}

}
