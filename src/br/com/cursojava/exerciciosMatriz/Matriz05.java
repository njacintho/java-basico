package br.com.cursojava.exerciciosMatriz;

import java.util.Scanner;

public class Matriz05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][][] agenda = new String[31][12][8]; // 31 dias e 24 horas.

		boolean sair = false;
		int opcao;

		while (!sair) {
			System.out.println("Digite 0 para sair: ");
			System.out.println("Digite 1 para adicionar compromisso na agenda: ");
			System.out.println("Digite 2 para verificar compromisso na agenda: ");

			opcao = scan.nextInt();

			if (opcao == 1 || opcao == 2) {
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido digite novamente!");
					}
				}
				boolean mesValido = false;
				int mes = 0;

				while (!mesValido) {
					System.out.println("Entre com o mês: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mes invalido digite novamente!");
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com o horario até 8: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora invalida digite novamente!");
					}
				}
				if (opcao == 1) {
					System.out.println("Digite o compromisso");
					agenda[--dia][--mes][--hora] = scan.next();
				} else if (opcao == 2) {
					dia--;
					System.out.println("O compromisso agendado é: ");
					System.out.println(agenda[dia][--mes][--hora]);
				}
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção invalida digite a opção correta");
			}
		}

	}
}
