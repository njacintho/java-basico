package br.com.cursojava.exerciciosPOO2;

public class ContaCorrente {
	
	private String titular;
	private int numero;
	private int agencia;
	private double saldo;
	private boolean especial;
	private double limiteSaque;
	

	
	public ContaCorrente(String titular, int numero, int agencia) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
//		this.saldo = saldo;
//		this.especial = especial;
//		this.limiteSaque = limiteSaque;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	double sacar(double saque) {
		 if(this.saldo >= saque) {
			 System.out.println("saque feito com sucesso");
			 this.saldo -= saque;
			 return this.saldo;
		 }else {
			 if(this.especial) {
				 System.out.println("Voc  est· usando o cheque especial");
				 
				 if(saque <= this.saldo + this.limiteSaque) {
					 this.saldo -= saque;
				 }else {
					System.out.println("Valor excede o limite do cheque especial, de: " + this.limiteSaque + "Sendo seu saldo de:" );
				}
				 return this.saldo;
			 }else {
				 System.out.println("Saldo insuficiente , seu saldo atual È: ");
				 return this.saldo;
			 }
		 }		

	}
	
	void depositar(double valor) {
		this.saldo += valor;
			
	}
	
	 void consultarSaldo() {
		System.out.println("Seu saldo atual È " + this.saldo);

	}
	
	boolean verficarCheqEspecial() {
		if(this.saldo < 0) {
			System.out.println("VocE entrou no cheque especial");
			return true;
		}else {
			System.out.println("VocÍ n„o est· no cheque especial");
			return false;
		}

	}

}
