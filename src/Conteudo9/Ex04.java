package Conteudo9;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a quantidade de termos: ");
		int numeroDeTermos = entrada.nextInt();

		double somatorio = 0;

		for (int i = 0; i < numeroDeTermos; i++) {
			int inicio = 1 + 4 * i;
			somatorio += ((double) inicio * (inicio + 1)) / ((inicio + 2) * (inicio + 3));
		}

		System.out.println("Valor da série = " + Math.sqrt(somatorio));
	}
}
