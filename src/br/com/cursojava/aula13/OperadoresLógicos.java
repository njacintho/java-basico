package br.com.cursojava.aula13;

public class OperadoresLógicos {

	public static void main(String[] args) {
		int valor1 = 1;
		int valor2 = 2;

		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);

		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);

		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);// curto circuito ele só testa a primeira parte 
		System.out.println(verdadeiro || falso);// curto circuito ele só testa a primeira parte
		System.out.println(verdadeiro ^ falso); // valores iguais falso, valores diferentes verdadeiro
		System.out.println(!verdadeiro || falso);

		// quando é "&" AND simples ele testa as duas partes assim como no "|" or   
	}

}
