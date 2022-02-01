package br.com.cursojava.exerciciosMetodos;

public class Lampada {
	
	String marca;
	String modelo;
	int tensao;
	int potencia;
	String cor;
	int meesGarantia;
	boolean interruptor;
	
	
	void ligarLampada() {
		interruptor = true;
	}
	
	void desligarLampada() {
		interruptor = false;
	}
	
	 void estadoLampada() {
		 if(interruptor) {
			 System.out.println("A lampada está ligada");
		 }else {
			 System.out.println("A lampada está desligada");
		 }

	}
	

}
