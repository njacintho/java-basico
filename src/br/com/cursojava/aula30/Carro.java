package br.com.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double volumCombustivel;
	double consumoCombustivel;

	public Carro(String marca, String modelo, int numPassageiros, double volumCombustivel, double consumoCombustivel) {

		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.volumCombustivel = volumCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
	}
	
	public Carro(String marca, String modelo){
		
		this(marca,modelo,10);
		System.out.println("Chamando construtor com 2 paramentros");
		
		
	}

	// Construtor igual porém vazio para não obrigar colocar os paramentros.Para o uso de frameworks
	public Carro() {
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.volumCombustivel * this.consumoCombustivel + "km");

	}

	double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado");
		return this.volumCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / this.consumoCombustivel;
		return qtdCombustivel;
	}

}
