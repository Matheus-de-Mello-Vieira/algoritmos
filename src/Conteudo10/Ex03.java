package Conteudo10;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o alfa: ");
		double alfa = entrada.nextDouble();

		double semiArea = 3.1416 * alfa / (360);
		double raio = 0;
		do {
			System.out.print("Insira o raio: ");
			raio = entrada.nextDouble();

			if (raio != -1.0) {
				System.out.printf("Área: %.4f\n", semiArea * Math.pow(raio, 2));
			}

		} while (raio != -1.0);
		entrada.close();
	}

}
