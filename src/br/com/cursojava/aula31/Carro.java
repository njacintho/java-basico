package br.com.cursojava.aula31;

/*
 * Modificadoeres de acesso: public: scessado por todos, private: somente dentro da classe, 
 * defaut: para todas as classes do pct.
 */

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double volumCombustivel;
	private double consumoCombustivel = 0.2;

	
	
//	public Carro(String marca, String modelo, int numPassageiros, double volumCombustivel, double consumoCombustivel) {
//		this.marca = marca;
//		this.modelo = modelo;
//		this.numPassageiros = numPassageiros;
//		this.volumCombustivel = volumCombustivel;
//		this.consumoCombustivel = consumoCombustivel;
//	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.volumCombustivel * this.consumoCombustivel + "km");

	}

	double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado");
		return this.volumCombustivel * this.consumoCombustivel;
	}
	

	private double dividirKmPorConsumo(double km) {
		return km / this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {
		return this.dividirKmPorConsumo(km);
	}
}
