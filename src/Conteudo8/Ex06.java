package Conteudo8;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int divisores4 = 0;
		int divisores3 = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o valor: ");
			int numero = entrada.nextInt();

			if (numero % 2 == 0) {
				System.out.println("É par");

				if (numero % 4 == 0) {
					divisores4 += numero;
				}
			}

			if (numero % 3 == 0) {
				divisores3++;
			}
		}

		System.out.printf("Soma dos números divisíveis por 4 = %d\nQuantidade de número divisíveis por 3 = %d",
				divisores4, divisores3);
		entrada.close();
	}

}
