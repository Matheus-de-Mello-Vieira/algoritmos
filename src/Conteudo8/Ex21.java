package Conteudo8;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o número: ");
		int numero = entrada.nextInt();

		if (numero == 1) {
			System.out.println("O numero não é primo");
			return;
		}

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("O numero não é primo");
				return;
			}
		}
		System.out.println("O numero é primo");
		entrada.close();
	}

}
