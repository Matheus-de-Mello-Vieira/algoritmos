package Conteudo9;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a quantidade de termos: ");
		int numeroDeTermos = entrada.nextInt();

		double somatorio = 0;

		for (int i = 1; i <= numeroDeTermos; i++) {
			somatorio += Math.pow(3, i + 1) / ((9 + i) * Math.pow(i, 2));
		}

		System.out.println("Valor da série = " + (100 - Math.pow(somatorio, 3)));
	}
}
