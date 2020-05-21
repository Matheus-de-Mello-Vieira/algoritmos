package Conteudo11;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor máximo: ");
		int valorMaximo = entrada.nextInt();

		// normalizando o número: se for impar, mantem o valor; se for par, decrementa 1
		valorMaximo += valorMaximo % 2 - 1;

		System.out.println(valorMaximo);
		int nMaximo = (valorMaximo - 1) / 2;

		double somatorio = 0;
		for (int i = 0; i <= nMaximo; i++) {
			int x = i * 2 + 1;
			double fx = x * x + (4 * x - 2) / 5.0;
			System.out.printf("f(%d) = %.1f\n", x, fx);
			somatorio += fx;
		}

		System.out.println("Média de f(x) = " + somatorio / (nMaximo + 1));
		entrada.close();
	}
}
