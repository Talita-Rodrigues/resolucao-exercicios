package com.talita.curso.java.nelio.alves;

import java.util.Locale;
import java.util.Scanner;

public class CalculoAreas {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de A:");
		double a = sc.nextDouble();
		System.out.println("Informe o valor de B:");
		double b = sc.nextDouble();
		System.out.println("Informe o valor de C:");
		double c = sc.nextDouble();

		// a) a área do triângulo retângulo que tem A por base e C por altura
		double areaDoTriangulo = (a * c) / 2;
		System.out.printf("Area do Triangulo = %.3f", areaDoTriangulo);

		// b) a área do círculo de raio C. (pi = 3.14159)
		double pi = 3.14159;
		double areaCirculo = pi * (c * c);
		System.out.printf("Area do Circulo = %.3f", areaCirculo);

		// c) a área do quadrado que tem lado B.
		double areaQuadrado = b * 4;
		System.out.printf("Area do Quadrado = %.3f", areaQuadrado);

	}
}
