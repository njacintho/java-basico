package br.com.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double volumCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + volumCombustivel * consumoCombustivel + "km" );
		
	}
	
	double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado");
		return volumCombustivel * consumoCombustivel;
	}

}
