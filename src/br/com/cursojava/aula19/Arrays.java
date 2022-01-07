package br.com.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double tempDia01 = 31.3;
		double tempDia02 = 32;
		double tempDia03 = 33.7;
		double tempDia04 = 34;
		double tempDia05 = 29.1;

		// tem que indicar a quantidade o tamanho da array
		double[] temperaturas = new double[365];
		// inicializando a array e atribuindo valor
		temperaturas[0] = 31.2;
		temperaturas[1] = 32;
		temperaturas[2] = 33;
		temperaturas[3] = 17.2;
		temperaturas[4] = 29.3;

		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

		System.out.println("O tamanho da array é: " + temperaturas.length);

		System.out.println("valores da array: " + temperaturas);// ele imprime aonde está guardado na memória
		
		
		for(int i = 0; i < temperaturas.length; i ++) {
			System.out.println("O valor da temperatura do dia " + (i +1) + " é: " + temperaturas[i]);
		}
		
		// forech acesso somente ao valor
		for (double temp : temperaturas) {
			System.out.println(temp);
			
		}

	}

}
