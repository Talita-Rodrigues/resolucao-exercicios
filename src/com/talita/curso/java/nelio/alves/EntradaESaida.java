package com.talita.curso.java.nelio.alves;

import java.util.Scanner;

public class EntradaESaida {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero:");
		int n1 = sc.nextInt();

		System.out.println("Digite outro n�mero:");
		int n2 = sc.nextInt();

		int soma = n1 + n2;

		System.out.println("SOMA = " + soma);
	}
}
