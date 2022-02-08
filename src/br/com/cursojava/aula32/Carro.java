package br.com.cursojava.aula32;

/*
 * Encapsulamento: métodos getters e setters
 */

public class Carro {
	
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double volumCombustivel;
	private double consumoCombustivel;
	
	

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getVolumCombustivel() {
		return volumCombustivel;
	}
	public void setVolumCombustivel(double volumCombustivel) {
		this.volumCombustivel = volumCombustivel;
	}
	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

}
