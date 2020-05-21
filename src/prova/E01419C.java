package prova;

import java.util.Scanner;

public class E01419C {
	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a quantidade de fatores: ");
		int quantidadeDeFatores = entrada.nextInt();
		double num, den, somatorio = 0;
		for (int i = 0; i < quantidadeDeFatores; i++) {
			num = Math.pow(7, i) + Math.sqrt(5 + 2 * i);
			den = Math.pow(10 + i, i + 1);
			somatorio += num / den;
		}
		somatorio = Math.pow(somatorio, 5);
		somatorio *= 2.0 / 3;
		somatorio += 100;
		System.out.print("Série = " + somatorio);

		entrada.close();
	}
}
