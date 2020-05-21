package Conteudo6;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor de x: ");
		double x = entrada.nextDouble();
		if (x == 4) {
			System.out.println("Resultado: 0");
		} else {
			System.out.printf("Resultado: %.2f", (5 * x + 3) / Math.sqrt(Math.abs(x * x - 16)));
		}
		entrada.close();
	}

}
