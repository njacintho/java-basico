package br.com.cursojava.exercicios;



public class Arrays21 {
	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);

		
		int[] vetorRan = new int [10];
		int qtd0 = 0;
		int qtd1 = 1;
		
		for (int i = 0; i < vetorRan.length; i++) {
			vetorRan[i] = (int) Math.round(Math.random() * 1);
			
			if(vetorRan[i] == 0) {
				qtd0++;
			}else {
				qtd1++;
			}
		}
		double porcent0 = (qtd0 * 100)/ vetorRan.length;
		double porcent1 = (qtd1 * 100)/ vetorRan.length;
		
		System.out.println("************Vetor randomico*************");
		for (int i = 0; i < vetorRan.length; i++) {
			System.out.print(vetorRan[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Porcentagem de 0 = " + porcent0);
		System.out.println("Porcetagem de 1 = " + porcent1);
		
		
		
		
		
	}
}
