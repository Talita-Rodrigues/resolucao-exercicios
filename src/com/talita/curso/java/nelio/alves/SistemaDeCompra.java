package com.talita.curso.java.nelio.alves;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeCompra {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o codigo da pe�a 1:");
		int codPeca1 = sc.nextInt();
		System.out.println("Informe a quantidade de pe�as:");
		int quantPeca1 = sc.nextInt();
		System.out.println("Informe o valor da pe�a 1:");
		double valorUnitarioPeca1 = sc.nextDouble();

		System.out.println("Informe o codigo da pe�a 2:");
		int codPeca2 = sc.nextInt();
		System.out.println("Informe a quantidade de pe�as:");
		int quantPeca2 = sc.nextInt();
		System.out.println("Informe o valor da pe�a 2:");
		double valorUnitarioPeca2 = sc.nextDouble();

		double valorTotal = (quantPeca1 * valorUnitarioPeca1) + (quantPeca2 * valorUnitarioPeca2);

		System.out.printf("Valor a Pagar: R$ %.2f", valorTotal);

	}
}
