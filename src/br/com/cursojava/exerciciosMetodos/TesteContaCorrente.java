package br.com.cursojava.exerciciosMetodos;


public class TesteContaCorrente {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.titular = "Noemi Oliveira";
		cc.agencia = 8267;
		cc.numero = 345676;
		cc.limiteSaque = 800.00;
		cc.especial = true;
		cc.saldo = 2035;
		
		System.out.println("A conta corrente de " + cc.titular + " é especial? " + cc.especial);
		System.out.println("Sua agencia é " + cc.agencia + ", " + cc.numero 
				+ " seu limite de saque por dia é " + cc.limiteSaque );
		
		cc.sacar(2100);
		System.out.println(cc.saldo);
		cc.verficarCheqEspecial();
		
		cc.depositar(200);
		System.out.println(cc.saldo);
		
		cc.consultarSaldo();
		
		cc.verficarCheqEspecial();
		
	}
	

}
