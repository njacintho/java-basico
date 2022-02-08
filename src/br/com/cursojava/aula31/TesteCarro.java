package br.com.cursojava.aula31;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.volumCombustivel = 78;
		van.numPassageiros = 7;
		
		
		
		System.out.println(van.numPassageiros);
		System.out.println(van.calcularCombustivel(20));
	}

}
