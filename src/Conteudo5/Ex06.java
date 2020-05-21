package Conteudo5;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o valor de A: ");
		double a = entrada.nextDouble();
		System.out.print("Informe o valor de B: ");
		double b = entrada.nextDouble();
		System.out.print("Informe o valor de C: ");
		double c = entrada.nextDouble();

		System.out.print("Informe o valor de X: ");
		double x = entrada.nextDouble();
		System.out.print("Informe o valor de Y: ");
		double y = entrada.nextDouble();

		System.out.print("Distância: ");
		System.out.println((a * x + b * y + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

		entrada.close();
	}

}
