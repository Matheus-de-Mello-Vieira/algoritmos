package Conteudo9;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a quantidade de termos: ");
		int numeroDeTermos = entrada.nextInt();

		double somatorio = 0;

		for (int i = 1; i <= numeroDeTermos; i++) {
			somatorio += ((double) (5 * i - 2)) / (6 * i + 1);
		}

		System.out.println("Valor da série = " + (5 * somatorio));
	}
}
