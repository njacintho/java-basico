package br.com.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 1; //contador
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		System.out.println(i);
		
		
		// do while primeiro voce excuta a linha de código depois testa a condição
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i<13);
		
		System.out.println(i);
	}

}
