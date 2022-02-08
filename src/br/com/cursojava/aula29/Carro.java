package br.com.cursojava.aula29;

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

	// Construtor igual por�m vazio para n�o obrigar colocar os paramentros.Para o uso de frameworks
	public Carro() {
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + volumCombustivel * consumoCombustivel + "km");

	}

	double obterAutonomia() {
		System.out.println("O m�todo obterAutonomia foi chamado");
		return volumCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}

}
