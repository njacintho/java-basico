package br.com.cursojava.aula30;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("fiat", "Ducato");
		
		System.out.println(van.numPassageiros);
		System.out.println(van.consumoCombustivel);

	}

}
