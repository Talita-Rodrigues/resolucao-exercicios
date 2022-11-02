package com.talita.periodo_02.programacaoESolucoesComputacionais.Prova01;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		float[] NUMEROS = new float[20];
		float soma = 0;
		for (int i = 0; i < 20; i++) {
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			System.out.print("Informe um numero real: ");
			float numero = sc.nextFloat();
			NUMEROS[i] = numero;
			soma += numero;
		}
		float MEDIA = soma / 20;

		System.out.println("MEDIA = " + MEDIA);
		System.out.println("VALORES NOS QUAIS NUMEROS[i] SUBTRAINDO A MEDIA, RESULTAM EM POSITIVOS:");
		for (int i = 0; i < 20; i++) {
			if (NUMEROS[i] - MEDIA > 0) {
				System.out.println(NUMEROS[i]);
			}
		}
	}
}
