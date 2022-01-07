package br.com.cursojava.exercicios;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );



		System.out.print("Digite Valor A :");
		int a = sc.nextInt();



		System.out.print("Digite Valor B :");
		int b = sc.nextInt();



		System.out.print("Digite Valor C : ");
		int c = sc.nextInt();



		System.out.print("Digite Valor D :");
		int d = sc.nextInt();
		
		
		int auxiliar = 0;
		 
		
		for(int i = 0; i < 3; i++) {
			
			if(a > b) {
				auxiliar = a;
				a = b;
				b = auxiliar;
			}
			
			if(b > c) {
				auxiliar = b;
				b = c;
				c = auxiliar;
			}
			if(c > d) {
				auxiliar = c;
				c = d;
				d = auxiliar;
			}
		}

		System.out.println( a + ", " + b + ", " + c + ", " + d + "." );
	}

}
