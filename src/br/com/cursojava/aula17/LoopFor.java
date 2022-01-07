package br.com.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("i tem o valor: " + i);
		}
		for (int i = 5; i > 0; i--) {
			System.out.println("i tem o valor: " + i);
		}

		// for com duas variaveis
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}

		// for com partes ausentes
		int count = 0;
		for (; count < 10;) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		// que é a mesma coisa que abaixo:
		for(int cont = 0; cont < 10; cont +=2) {
			System.out.println("valor de cont: " + cont);
		}
		
		// For loop infinito igual while = true
		//for( ; ; );
		// soma direto no for como valor vazio
		int soma = 0;
		for(int i = 1; i < 5; soma += i++) {
			//sem valor
		}
		System.out.println("O valor da soma é " + soma );
	}

}
