package Conteudo10;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a taxa de lucro: ");
		double lucro = Double.parseDouble(entrada.nextLine().replace("%", "")) / 100 + 1;
		double serie = 0, parcial = 0;
		String nome = "";
		do {
			System.out.print("Insira o nome do produto: ");
			nome = entrada.nextLine();
			// nome, quantidade, pre�o
			if (!nome.equals("FIM")) {
				System.out.print("Insira a quantidade: ");
				parcial = entrada.nextDouble();
				entrada.nextLine();

				System.out.print("Insira a pre�o unit�rio: ");
				parcial *= entrada.nextDouble();
				entrada.nextLine();

				System.out.printf("Custo parcial: %.2f\n", parcial);
				serie += parcial;
			}

		} while (!nome.equals("FIM"));

		System.out.printf("Pre�o final: %.2f\n", serie * lucro);
		entrada.close();
	}
}
