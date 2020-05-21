package Conteudo10;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double valor = 0;
		double somatorio = 0;
		int quantidade = 0;
		int quantidadeAcima1000 = 0;
		do {
			System.out.print("Insira o valor: ");
			valor = entrada.nextDouble();

			if (valor != 0) {
				somatorio += valor;
				quantidade++;

				if (valor > 1000) {
					quantidadeAcima1000++;
				}
			}

		} while (valor != 0);

		System.out.println("Valor total recebido: " + somatorio);
		System.out.printf("Média dos valores: %.2f\n", somatorio / quantidade);
		System.out.println("Quantidade de valores acima de R$1000,00: " + quantidadeAcima1000);

		entrada.close();
	}

}
