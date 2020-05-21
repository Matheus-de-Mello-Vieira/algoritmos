package Conteudo8;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("valor n: ");
		int n = entrada.nextInt();
		entrada.nextLine();

		System.out.print("insira o caracter: ");
		char caractere = entrada.nextLine().charAt(0);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(caractere + " ");
			}
			System.out.println();
		}
		entrada.close();
	}

}
