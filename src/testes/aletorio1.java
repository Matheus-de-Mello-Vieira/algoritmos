package testes;

import java.util.Scanner;

public class aletorio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int aux, soma = 0;

		System.out.print("Informe valor final do for: ");

		int fim = teclado.nextInt();

		for (aux=1; aux<fim; aux+=4) {
			System.out.println("FOR");
		     if (aux == 1 || aux % 5 == 0)

		           System.out.println("Valor impresso dentro do for = "+aux);

		           soma += aux;
		}
		System.out.println("Soma final = "+soma);
		teclado.close();
	}
}
