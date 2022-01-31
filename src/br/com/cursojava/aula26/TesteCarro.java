package br.com.cursojava.aula26;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo =  "Ducato";
		van.numPassageiros = 10;
		van.volumCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		
		System.out.println("A autonomia do carro está sendo de: " + van.obterAutonomia());

	}

}
