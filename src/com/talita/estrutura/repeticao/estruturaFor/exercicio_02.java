package com.talita.estrutura.repeticao.estruturaFor;

public class exercicio_02 {
	public static void main(String[] args) {

		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma = soma + i;
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.print("Soma = " + soma);
	}

}
