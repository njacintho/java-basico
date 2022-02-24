package br.com.cursojava.exerciciosPOO;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.titular = "Noemi Oliveira";
		cc.agencia = 8267;
		cc.numero = 345676;
		cc.limiteSaque = 800.00;
		cc.especial = false;
		
		System.out.println("A conta corrente de " + cc.titular + " é especial? " + cc.especial);
		System.out.println("Sua agencia é " + cc.agencia + ", " + cc.numero 
				+ " seu limite de saque por dia é " + cc.limiteSaque );

		
		
	}

}
