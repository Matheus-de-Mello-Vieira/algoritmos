package Conteudo10;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor de A: ");
		double A = entrada.nextDouble();
		System.out.print("Insira o valor de B: ");
		double B = entrada.nextDouble();
		System.out.print("Insira o valor de C: ");
		double C = entrada.nextDouble();

		double den = Math.sqrt(A * A + B * B);
		double distancia = 0;
		do {
			System.out.print("Insira o valor de X: ");
			double X = entrada.nextDouble();
			System.out.print("Insira o valor de Y: ");
			double Y = entrada.nextDouble();

			distancia = (X * A + Y * B + C) / den;
			System.out.println("Distância = " + distancia);
		} while (distancia != 0);
		entrada.close();
	}
}
