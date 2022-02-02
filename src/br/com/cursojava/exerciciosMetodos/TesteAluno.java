package br.com.cursojava.exerciciosMetodos;

import java.util.Iterator;
import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.println("Entre com nome do aluno");
		aluno.nome = scan.next();

		System.out.println("Entre com a matricula: ");
		aluno.matricula = scan.nextInt();

		System.out.println("Entre com nome o curso");
		aluno.curso = scan.next();

		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Entre com as disciplinas do curso");
			aluno.disciplinas[i] = scan.next();
		}
		
		for (int i = 0; i < aluno.notas.length; i++) {
			System.out.println("Notas da disciplina de " + aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notas[i].length; j++) {
				System.out.println("Entre com as notas");
				aluno.notas[i][j] = scan.nextDouble();
			}
		}
		System.out.println("------------------------------------------------------------------------");
		
		aluno.motraDados();
		
		System.out.println("------------------------------------------------------------------------");
		
		for(int i = 0; i <aluno.disciplinas.length; i++) {
			
			if(aluno.verificarAprovacao(i)) {
				System.out.println("Disciplina: " + aluno.disciplinas[i] + ". Está aprovado");
			}else {
				System.out.println("Disciplina: " + aluno.disciplinas[i] + ". Está reprovado");
			}
		}
	}

}
