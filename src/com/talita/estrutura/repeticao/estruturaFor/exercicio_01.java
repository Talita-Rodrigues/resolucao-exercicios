package com.talita.estrutura.repeticao.estruturaFor;

import java.util.Scanner;

public class exercicio_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o limite máximo: ");
		int limiteSuperior = sc.nextInt();
		System.out.println("Digite o incremento: ");
		int incremento = sc.nextInt();

		for (int i = 0; i <= limiteSuperior; i += incremento) {
			System.out.print(i + " ");
		}
	}
}
