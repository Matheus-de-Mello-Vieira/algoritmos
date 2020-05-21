package Conteudo10;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double somatorio = 0.0;
		int quantidade = 0;
		double valor = 0;
		do {
			System.out.print("Insira o valor: ");
			valor = entrada.nextDouble();

			if (valor != -1.0) {
				System.out.printf("Valor da multa: %.2f\n", valor / 10);
				quantidade++;
				somatorio += valor;
			}

		} while (valor != -1.0);

		System.out.printf("Média das multas: %.2f", somatorio / (quantidade * 10));
		entrada.close();
	}
}
