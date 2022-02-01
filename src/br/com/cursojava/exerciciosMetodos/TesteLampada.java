package br.com.cursojava.exerciciosMetodos;


public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampQuarto = new Lampada();
		lampQuarto.cor = "Rosa";
		lampQuarto.modelo = "LED";

		lampQuarto.ligarLampada();
		lampQuarto.estadoLampada();
		
		lampQuarto.desligarLampada();
		lampQuarto.estadoLampada();

	}

}
