package br.com.cursojava.exerciciosMetodos;

public class ContaCorrente {

	String titular;
	int numero;
	int agencia;
	double saldo;
	boolean especial;
	double limiteSaque;
	
	
	double sacar(double saque) {
		 if(saldo >= saque) {
			 System.out.println("saque feito com sucesso");
			 saldo -= saque;
			 return saldo;
		 }else {
			 if(especial) {
				 System.out.println("Voc  est· usando o cheque especial");
				 
				 if(saque <= saldo + limiteSaque) {
					 saldo -= saque;
				 }else {
					System.out.println("Valor excede o limite do cheque especial, de: " + limiteSaque + "Sendo seu saldo de:" );
				}
				 return saldo;
			 }else {
				 System.out.println("Saldo insuficiente , seu saldo atual È: ");
				 return saldo;
			 }
		 }		

	}
	
	void depositar(double valor) {
		saldo += valor;
			
	}
	
	 void consultarSaldo() {
		System.out.println("Seu saldo atual È " + saldo);

	}
	
	boolean verficarCheqEspecial() {
		if(saldo < 0) {
			System.out.println("VocE entrou no cheque especial");
			return true;
		}else {
			System.out.println("VocÍ n„o est· no cheque especial");
			return false;
		}

	}
}
