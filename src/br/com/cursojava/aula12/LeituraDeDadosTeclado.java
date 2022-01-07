package br.com.cursojava.aula12;

import java.util.Scanner;

import javax.xml.namespace.QName;

public class LeituraDeDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// System.out.println("Digite seu nome completo: ");
		// String nomeCompleto = scan.nextLine(); // lê uma linha completa
		// System.out.println("Seu nome completo é: " + nomeCompleto);
		//
		// System.out.println("Digite seu primeiro nome: ");
		// String primeroNome = scan.next(); // lê apenas a primeira String (palavra)
		// System.out.println("Seu primeiro nome é: " + primeroNome);
		//
		//
		// System.out.println("Digite a sua idade: ");
		// int idade = scan.nextInt();
		// System.out.println("A sua idade é: " + idade);
		//
		//
		// System.out.println("Digite a sua idade: ");
		// Double altura = scan.nextDouble();
		// System.out.println("A sua idade é: " + altura);

		System.out.println(
				"Informe alguns dados como: Seu primeiro nome, idade, quantos filhos tem, sua altura e se possui aninais de estimação");

		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura2 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();

		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Seu Primeiro nome é: " + primeiroNome);
		System.out.println("Você têm : " + idade + " anos");
		System.out.println("Você tem " + qtdFilhos + " filhos");
		System.out.println("Você tem " + altura2 + " de altura");
		System.out.println("E você tem pet? " + temPet);

	}

}
