package br.com.cursojava.aula20;

import java.text.DecimalFormat;

public class Matriz {
	public static void main(String[] args) {
		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(" -> " + notasAlunos[i][j]);
			}
			System.out.println();
		}

		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.println("Calculando a média de cada aluno");

		double soma = 0;
		double media;
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			media = soma / 4;
			System.out.println("Média do aluno " + i + " é: " + df.format(media));
		}

		System.out.println("Declarando de uma vez em arrays e matrizes");
		
		double[] notasAluno1 = {7,8,9,10};
		
		double[] [] notasAlunosClass = {{7,8,9,10}, {6,9,8,10}};
		
		for (int i = 0; i < notasAlunosClass.length; i++) {
			for (int j = 0; j < notasAlunosClass[i].length; j++) {
				System.out.print(" -> " + notasAlunosClass[i][j]);
			}
			System.out.println();
		}

	}

}
