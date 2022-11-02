package com.talita.periodo_02.programacaoESolucoesComputacionais.Prova01;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		int A = 999;
		int B = 999;
		int C = 999;
		Scanner sc = new Scanner(System.in);
		while (A != 0 && A != 1) {
			System.out.print("Informe o Valor de Alice: ");
			A = sc.nextInt();
			if (A != 0 && A != 1) {
				System.out.println("Valor incorreto para Alice. Informe um valor entre 0 e 1");
			}
		}
		while (B != 0 && B != 1) {
			System.out.print("Informe o Valor de Beto: ");
			B = sc.nextInt();
			if (B != 0 && B != 1) {
				System.out.println("Valor incorreto para Beto. Informe um valor entre 0 e 1");
			}
		}
		while (C != 0 && C != 1) {
			System.out.print("Informe o Valor de Clara: ");
			C = sc.nextInt();
			if (C != 0 && C != 1) {
				System.out.println("Valor incorreto para Clara. Informe um valor entre 0 e 1");
			}
		}
		if (((A == B) || (B == A)) && ((C != A) && (C != B))) {
			System.out.println("C");
		} else if (((A == C) || (C == A)) && ((B != A) && (B != C))) {
			System.out.println("B");
		} else if (((B == C) || (C == B)) && ((A != B) && (A != C))) {
			System.out.println("A");
		} else {
			System.out.println("*");
		}
	}
}
