package br.com.cursojava.aula14;

import java.util.Scanner;

public class CondicionaisIfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a sua idade: ");

		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("Voc� � maior de idade.");
		} else {
			System.out.println("Voc� � menor de idade.");
		}

		// Item � barato <= 10, 10 < valor 15 -0 pedir desconto,
		// 15 <= valor 17 - pesquisar mais, >= 17 - muito caro

		System.out.println("Entre com o valor do produto: ");
		double valor = scan.nextDouble();

		if (valor <= 10) {
			System.out.println("Est� barato, pode comprar.");

		} else if (valor > 10 && valor < 15) {
			System.out.println("Voc� pode pedir desconto.");

		} else if (valor >= 15 && valor < 17) {
			System.out.println("Melhor pesquisar mais.");
		} else {// valor >= 17
			System.out.println("MUito caro.");
		}

	}

}
