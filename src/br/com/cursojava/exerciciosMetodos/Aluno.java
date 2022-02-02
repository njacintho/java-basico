package br.com.cursojava.exerciciosMetodos;

public class Aluno {
	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notas = new double[3][4];


	void motraDados() {
		System.out.println("Aluno: " + nome + " - matricula: " + matricula );
		System.out.println("Nome do curso: " + curso);

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas da disciplina de " + disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	double obeterMedia(int indice) {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[indice][i];
		}
		double media = soma / 4;
		return media;
	}

	boolean verificarAprovacao(int indice) {
		if (obeterMedia(indice) >= 7) {
			return true;
		}
		return false;
	}
}
