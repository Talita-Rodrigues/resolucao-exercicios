package com.talita.curso.java.nelio.alves;

import java.util.Locale;
import java.util.Scanner;

public class CalculaSalario {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero do funcionario:");
		int numeroFuncionario = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas:");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor da hora:");
		double valorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorHora;

		System.out.println("Numero do funcionario: " + numeroFuncionario);
		System.out.printf("Salario = R$ %.2f", salario);
	}
}
